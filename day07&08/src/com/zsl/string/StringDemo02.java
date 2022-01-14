package com.zsl.string;

import java.util.Random;
import java.util.Scanner;

public class StringDemo02 {



    public static void main(String[] args) {
        //模拟用户登录 三次机会
        String okName = "zsl";
        String okPassword = "123456";
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();


        //三次机会
        for (int n = 0; n < 3; n++) {
            String okCode = "";
            for (int i = 0; i < 5; i++) {
                int index = ra.nextInt(datas.length());//获取边界为datas.length的随机数
                char c = datas.charAt(index);
                okCode += c;
            }

            System.out.println("验证码：" + okCode);
            System.out.println("------------------------");

            System.out.print("账号：");
            String name = sc.next();
            System.out.print("密码：");
            String password = sc.next();
            System.out.print("验证码：");
            String code = sc.next();

            if (name.equals(okName) && password.equals(okPassword)){

                if (code.equalsIgnoreCase(okCode)){
                    System.out.println("登录成功");
                    break;
                }else{
                    System.out.println("验证码输入错误，还有" + (2 - n) + "次机会" );
                }
            }else{
                System.out.println("账号或密码输入错误，还有" + (2 - n) + "次机会");
            }

        }

    }

}
