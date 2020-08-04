package com.whisper.shop.utils;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;


public class MD5Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("MD5:"+MD5.getMD5("whisper"));
        String text=MD5.encodeBase64("whisper");
        System.out.println("encodeBase64:"+text);
        System.out.println("decodeBase64:"+MD5.decodeBase64(text));
    }
}
