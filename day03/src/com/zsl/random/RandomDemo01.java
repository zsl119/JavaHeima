package com.zsl.random;

import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        //创建随机数对象
        //调包基本都先要new一个对象
        Random ra = new Random();
        //调用nextInt方法，可以返回一个整形的随机数，并且要用一个变量来接一下这个随机数
        for (int i = 0; i < 10; i++) {
            int data = ra.nextInt(10);//表示随机数的边界是10,不包括10
            System.out.println(data);
        }
        System.out.println("----------------------");
        //技巧：把某段代码快捷放到循环中去：Ctrl Alt T
        //上面的nextInt方法生成的随机数范围0-(n-1)
        //那么如何生成其他区间随机数呢，比如4-8：用加减法
        //for循环内定义的变量只在循环内生效
        for (int i = 0; i < 10; i++) {
            int data = ra.nextInt(5);//随机数范围0 1 2 3 4
            System.out.println(data+4);//随机数结果＋4 新的范围4 5 6 7 8
        }
    }
}
