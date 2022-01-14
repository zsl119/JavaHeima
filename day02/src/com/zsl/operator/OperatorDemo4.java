package com.zsl.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 变量自增自减
        int a = 19;
        //单独使用时 ++放前面后面没有区别
        a++;
        ++a;
//        System.out.println(a);
        int c = --a;//a先减1再 赋值给c
        System.out.println(c);

        int b = 10;
        b--;
        --b;
//        System.out.println(b);

        int d = b++;//b先赋值再加1
        System.out.println(d);

        int k = 5;
        int p = 3;
        int rs =  k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println("rs=" + rs);
        System.out.println("k=" + k);
        System.out.println("p=" + p);
        //结果 5 + 7 - 2 + 2 - 7 + 2 + 2 = 9  此时 k = 6  p = 2
    }
}
