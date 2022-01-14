package com.zsl.operator;

public class OperatorDemo {
    public static void main(String[] args) {
//        加 减 乘 除 取余 + - * / %
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//输出值是整数
        System.out.println(a * 1.0 / b);//输出值是小数
        System.out.println(a / b * 1.0);//输出值是小数，但是3.0
        System.out.println(a % b);

    }
}
