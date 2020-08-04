package com.whisper.shop.utils;


import org.apache.commons.codec.binary.Base64;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5 {
    public static String getMD5(String text)  {
        //String base=text+"helloword";
        String md5= DigestUtils.md5Digest(text.getBytes()).toString();
        return md5;
    }
    public static String encodeBase64(String text){
         return Base64.encodeBase64String(text.getBytes());
    }
    public static String decodeBase64(String text) throws UnsupportedEncodingException {
      return new String(Base64.decodeBase64(text.getBytes()),"UTF-8");

    }
}
