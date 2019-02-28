package com.redwood.api.base;

import cn.hutool.extra.servlet.ServletUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.core.type.TypeReference;
import com.redwood.api.config.JacksonConfig;
import com.redwood.api.config.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Controller公共组件
 */
public abstract class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected final static String requestPathPrifex = ".do";

    @Autowired
    protected HttpServletRequest request;


    @Autowired
    JacksonConfig jacksonConfig;

    @Resource
    protected RedisUtil redisUtil;


    protected String getContextPath() {
        return request.getContextPath();
    }


    protected Integer getParamInt(String key){
        var value = this.request.getParameter(key);
        if(value.isEmpty())
            return 0;

        return Integer.parseInt(this.request.getParameter(key));
    }

    protected String getParamStr(String key){
        return this.request.getParameter(key);
    }

    /**
     * 页码
     *
     * @return
     */
    protected Integer getPageIndex() {

        var pageIndex = this.getParamInt("offset");
        if (null == pageIndex || pageIndex <= 0) {
            pageIndex = 1;
        }
        return (pageIndex / getPageSize()) + 1;
    }

    /**
     * 分页大小
     *
     * @return
     */
    protected Integer getPageSize() {
        var pageSize = this.getParamInt("limit");
        if (null == pageSize || pageSize <= 0) {
            pageSize = 30;
        }
        return pageSize;
    }

    protected Page getPage() {
        return new Page(getPageIndex(), getPageSize());
    }


    private boolean checkFieldJump(String name) {
        var jumpField = new String[]{"serialVersionUID"};
        for (var field : jumpField) {
            if (field.equals(name))
                return true;
        }

        return false;
    }

    protected <T> QueryWrapper getBootstrapWrapper(Class<T> beanClass, HashMap<String, Serializable> searchMathMap) {
        try {
            var wrapper = new QueryWrapper();
            var queryFilter = this.getParamStr("filter");
            var queryBean = jacksonConfig.getObjectMapper().readValue(queryFilter, beanClass);

            //var queryFields = queryBean.getClass().getFields();

            List<Field> fieldList = new ArrayList() ;
            Class tempClass = queryBean.getClass();
            //当父类为null的时候说明到达了最上层的父类(Object类).
            while (tempClass != null) {
                fieldList.addAll(Arrays.asList(tempClass .getDeclaredFields()));
                //得到父类,然后赋给自己
                tempClass = tempClass.getSuperclass();
            }
            for (var field : fieldList) {
                field.setAccessible(true);

                var name = field.getName();
                var val = field.get(queryBean);
                if (val != null && val != "" && !checkFieldJump(name))
                    wrapper.like(name, val);
            }
            wrapper.eq("1","1");

            var search = this.getParamStr("search");


            if (search != null && search.length() != 0) {
                for (var math : searchMathMap.entrySet()) {
                    if (Pattern.compile(math.getKey()).matcher(search).matches())
                        wrapper.like(math.getValue(), search);
                }
            }

            return wrapper;
        } catch (Exception e) {
            logger.error("处理fliter异常", e);
            return new QueryWrapper();
        }
    }

    /**
     * 将请求字符串转换为指定对象
     * @param param
     * @param beanClass
     * @param <T>
     * @return
     */
    protected <T> T getUpdateData(String param, Class<T> beanClass) {
        try {

            return jacksonConfig.getObjectMapper().readValue(this.getParamStr(param), beanClass);
            //return JSONUtil.toBean(getRequestStr(param), beanClass);
        } catch (Exception e) {
            logger.error("处理updateData异常", e);
            return null;
        }
    }


    /**
     * 发送文件响应流
     * @param response
     * @param fileName
     */
    protected void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(), "ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}