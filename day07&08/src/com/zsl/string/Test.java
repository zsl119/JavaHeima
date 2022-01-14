package com.zsl.string;

public class Test {
    public static void main(String[] args) {
        String s1 = "你好";
        String s2 = "中国";
        s1 = s1 + s2;
        System.out.println(s1);//你好中国
        //表面上看是把字符串s1变化了
        //但实际上是在堆内存又生成了一个“你好中国”的字符串，原有的“你好”，“中国”并没鞋油发生变化
        //只是在栈内存存储的s1指向堆内存地址由“你好”变成了“你好中国”

        //以""方式 存储的String变量 只会存储一份
        String s3 = "中国";
        System.out.println(s3 == s2);//true

        //以new的方式构造对象，每new一次就会有一个新的
        char[] c1 = {'a','b','c'};
        String s4 = new String(c1);
        String s5 = new String(c1);
        System.out.println(s4 == s5);//false

        String s6 = new String("ab");
        //这行代码先“”创建了一个，又new了一个，同时创建了两个对象
        String s7 = "ab";
        //这一行其实一个对象都没有创建，因为上一行已经创建了
        System.out.println(s6 == s7);//false

        String s8 = "ABC";
        String s9 = "AB";
        String s10 = s8 + "C";
        //只要不是直接“”得来的，都是相当于new的，但是也有特例
        System.out.println(s10 == s8);//false

        String s11 = "cba";
        String s12 = "c" + "b" + "a";
        System.out.println(s11 == s12);//输出为true
        //这是因为java存在编译优化机制，编译"c" + "b" + "a"会直接转换成"cba"
    }
}
