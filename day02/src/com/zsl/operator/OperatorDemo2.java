package com.zsl.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //拆分百 十 个 位
        int a = 123;
        int ge = a % 10;
        System.out.println(ge);
        int shi = a / 10 % 10;
        System.out.println(shi);
        int bai = a / 100;
        System.out.println(bai);

    }
}
