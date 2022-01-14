package com.zsl.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //逻辑运算符
        double size = 6.28;
        int weight = 218;
        //尺寸大于5。8 而且 重量大于180
        boolean a = size >= 5.8 & weight >= 180;
        System.out.println(a);
        //尺寸大于5.8 或者 重量小于180
        boolean b = size >= 5.8 | weight <= 180;
        System.out.println(b);
        //逻辑异或 两个结果不同才是true
        boolean c = a ^ b;//a b 都是true 所以c是false
        boolean d = c ^ b;//true
        System.out.println(c);
        System.out.println(d);

        //双逻辑符号 && ||
        //&&：与&结果一致，区别在于&&只要判断出左边为假，便不会往下继续判断，直接输出为false
        //||：与|结果一致，区别在于||只要判断出左边为真，便不会往下继续判断，直接输出为true
        int m = 10;
        int n = 15;
        System.out.println(m != 10 && ++n == 15 );
        System.out.println(n);//n输出还是15，没有自增
        System.out.println(m == 10 && ++n == 15 );//输出为false， a自增了
        System.out.println(n);//输出为16


    }
}
