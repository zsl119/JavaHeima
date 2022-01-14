package com.zsl.branch;

public class DowhileDemo09 {
    public static void main(String[] args) {
        //do-while循环 是先执行一次循环体 再判断是否满足循环条件
        //即无论如何都会执行一次
        int i = 0;
        do {
            //循环体 + 迭代
            System.out.println("你好");
            i++;
        } while (i < 3);

        System.out.println("---------------------");

        //for循环变量j只在循环内部生效
        //即多个for循环可以用一个变量
        for (int j = 0; j < 3; j++){
            System.out.println("Hello");
        }
        for (int j = 0; j < 3; j++){
            System.out.println("Hello World");
        }

        //而while的变量在循环外也能用
        System.out.println(i);

    }
}
