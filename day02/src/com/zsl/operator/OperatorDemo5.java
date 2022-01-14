package com.zsl.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 赋值运算符 += -= *= /= %=
        // 赋值运算符自带强制类型转换
        int a = 10;
        int b = 20;
        a += b; //a = a + b;
        System.out.println(a);

        double m = 6.2;
        int n = 2;
        n += m; //m强制转换为int
        System.out.println("n="+n);

        byte i = 5;
        byte j = 6;
        i += j;
        System.out.println(i);
    }
}
