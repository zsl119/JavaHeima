package com.zsl.branch;

import java.util.Scanner;

public class DeadDemo10 {
    public static void main(String[] args) {
        //死循环
//        for ( ; ; ){
//            System.out.println("就这");
//        }


        //经典写法
//        while (true){
//            System.out.println("就这");
//
//        }

//        do {
//            System.out.println("就这");
//        }while (true);

        System.out.println("---------------------");
        //1.定义一个正确密码
        int okPassword = 520;
        //定义死循环让用户不断输入密码，正确则跳出
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("请输入密码：");
            int password = sc.nextInt();
            //if语句判断密码是否正确
            if (password == okPassword){
                System.out.println("密码正确，登陆成功！");
                break;
            } else {
                System.out.println("密码错误！");
            }

        }


    }
}
