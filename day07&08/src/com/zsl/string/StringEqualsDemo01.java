package com.zsl.string;

import java.util.Scanner;

public class StringEqualsDemo01 {
    public static void main(String[] args) {
        //正确的登录密码
        String okName = "zsl";
        String okPassword = "123456";

        //登录
        System.out.println("请输入登录账号和密码");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String password = sc.next();
        //if (okName == name && okPassword == password){
        if (name.equals(okName) && password.equals(okPassword)){
        //改用equals()构造器后就可以了

            //乍一看以为可以，当运行之后会发现即使输入正确的账号和密码也会提示登录失败
            //因为name的定义方式不是直接“”
            //而okName == name && okPassword == password判断的是两者的地址，不是两者的内容
            System.out.println("登录成功");
        }else
            System.out.println("登录失败");

        //实际上常用的字符串内容的比较，java当然也提供了字符串内容比较的api
        //equals只关心内容是否一样
        //关于equals的两个构造器equals 和 equalsIgnoreCase(表示忽略大小写比较）

        //验证码判断
        String okCode = "aFd3gH";
        System.out.println("请输入验证码");
        String code = sc.next();
        System.out.println(code.equalsIgnoreCase(okCode));


    }
}
