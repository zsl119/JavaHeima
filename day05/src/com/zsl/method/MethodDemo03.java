package com.zsl.method;

public class MethodDemo03 {
    public static void main(String[] args) {
        //基本参数传递
        int x = 10;
        unchange(x);
        System.out.println("调用方法后x值：" + x);//调用后输出还是10
        //这是基本数据类型，不变化
        //基本数据类型int的存储是在 栈内存 中，方法的形参是在 堆内存 中，只能通过return传到 栈内存
        System.out.println("调用方法后return值：" + unchange(x));//而return值才是20

        String[] arrs = {"abc", "acb", "bca"};
        change(arrs);
        System.out.println(arrs[1]);//数组是引用数据类型，输出是ccc 发生了变化
        //原因就是引用数据类型直接输出是一个地址[Ljava.lang.String;@3b9a45b3
        //即引用数据类型在 栈内存 中就是一个地址，这个地址指向的是 堆内存
        // 数组数据就是存储在 堆内存 里，方法的执行是在 栈内存 中

        System.out.println(arrs);



    }

    public static int unchange(int a){
        a = 20;
        return a;
    }

    public static void change(String[] arrs){
        arrs[1] = "ccc";

    }
}
