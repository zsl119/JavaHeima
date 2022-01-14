package com.zsl.method;

import java.util.Scanner;

public class MethodDemo02 {
    public static void main(String[] args) {
        //求和方法编写与调用
        //输入n，输出1-n的和
        System.out.print("请输入正整数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //要记住，调用方法sum(),sum()实际上是一个int型变量he;
        System.out.print("前n项和为：" + sum(n));

    }

    //写方法时要考虑两条
    //1.需不需要型参，即调用该方法时需不需要输入什么
    //2.需不需要返回值，即调用方法后需不需要输出什么
    public static int sum(int a){
        int he = 0;
        for (int i = 1; i <= a; i++) {

            he += i;
        }
        return he;
    }


}
