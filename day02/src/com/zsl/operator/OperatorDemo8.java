package com.zsl.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //三元运算符
        double score = 80;
        //三元运算符 先写socore >= 60 ?  再在后面跟上输出 "通过" : "不通过"  最后定义一下你要输出的变量即可
        String rs = score >= 60 ? "通过" : "不通过";
        System.out.println(rs);

        //判断2个数大小
        int a = 11;
        int b = 100;
        int max = a > b ? a : b;
        System.out.println(max);

        //判断3个数大小
        //利用临时变量temp
        int c = 121;
        int temp = a > b ? a : b;
        int rsMax = temp > c ? temp : c;
        System.out.println(rsMax);
        //或者直接求出三个数最大的
        int rsMax2 = a > b ? a > c ? a : c  : b > c ? b : c;
        System.out.println(rsMax2);


    }
}
