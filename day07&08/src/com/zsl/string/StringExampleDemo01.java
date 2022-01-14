package com.zsl.string;

import java.util.Random;

public class StringExampleDemo01 {
    public static void main(String[] args) {
        //验证码

        //定义一个字符串 然后随机索引 循环5次
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random ra = new Random();
        String code = "";

        for (int i = 0; i < 5; i++) {
            //随机索引
            int index = ra.nextInt(datas.length());
            char c = datas.charAt(index);
            code += c;
        }

        System.out.println(code);
    }
}
