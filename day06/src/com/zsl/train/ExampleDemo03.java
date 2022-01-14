package com.zsl.train;

import java.util.Random;

public class ExampleDemo03 {
    //开发验证码：定义方法实现随机产生一个5位验证码，每位可能是数字、大小写字母
    //方法参数是验证码位数，返回值类型是String
    public static void main(String[] args) {
        //调用方法生成随机验证码
        String newcode = code(6);
        System.out.println(newcode);

    }
    public static String code(int n){
        String code = "";//先定义一个空验证码来接数据
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            //先定义生成随机字符类型
            int type = ra.nextInt(3);//0数字 1小写 2大写
            switch (type){
                case 0:
                    //数字 0-9
                    int sz = ra.nextInt(10);
                    code += sz;
                    break;
                case 1:
                    //小写（a 97 - z 97+25)  随机数 加减法 0-25  + 97
                    char ch1 = (char) (ra.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    //大写 （A 65 - Z 65+25)  随机数 加减法 0-25  + 65
                    //char类型输出，随机数是int型，所以要强转
                    //在ra左边按Alt + 回车
                    char ch2 = (char) (ra.nextInt(26) + 65);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
