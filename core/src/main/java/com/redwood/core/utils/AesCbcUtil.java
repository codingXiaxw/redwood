package com.redwood.core.utils;

import com.redwood.core.common.RedwoodException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Security;

/**
 * Created by yfs on 2018/3/25.
 * AES-128-CBC 加密方式 *
 * 注： * AES-128-CBC可以自己定义“密钥”和“偏移量“。 * AES-128是jdk自动生成的“密钥”。
 */
public class AesCbcUtil {
    static {
        //BouncyCastle是一个开源的加解密解决方案，主页在http://www.bouncycastle.org/
        Security.addProvider(new BouncyCastleProvider());
    }

    /**
     * AES解密
     * @param data 密文
     * @param key 秘钥
     * @param iv 偏移量
     * @param encodingFormat 编码
     * @return 解密后的数据
     * @throws Exception
     */
    public static String decrypt(String data, String key, String iv, String encodingFormat){
        //被加密的数据
        byte[] dataByte = Base64.decode(data);
        //加密秘钥
        byte[] keyByte = Base64.decode(key);
        //偏移量
        byte[] ivByte = Base64.decode(iv);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);
            // 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, encodingFormat);
                return result;
            }
            return null;
        } catch (Exception e) {
            throw new RedwoodException(e);
        }
    }
}
