package com.zsl.method;

public class MethodDemo06 {
    public static void main(String[] args) {
        divid(3,0);
        divid(8,2);

    }

    //return关键词结束方法
    public static void divid(int a, int b){
        if (b == 0){
            System.out.println("Error");
            return;//当b==0时直接结束方法，不执行a/b
        }
        int c = a / b;
        System.out.println(c);
    }
}
