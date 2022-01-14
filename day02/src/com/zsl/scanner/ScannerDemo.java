package com.zsl.scanner;

import java.util.Scanner;

//导包操作(并不需要自己写的，以后通过工具导入更方便,就是下面在调用函数时上面会自动补包)
public class ScannerDemo {
    public static void main(String[] args) {
        //键盘录入技术
        //得到一下扫描器对象
        Scanner sc = new Scanner(System.in);
        //调用sc对象的功能 等待接收用户输入的数据
        //这行代码会等待用户输入数据，直到用户输完并回车就会把数据拿到
        //常常要定义一个变量来接收存储用户输入的数据
        System.out.print("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.print("请输入您的姓名：");
        String name = sc.next();
        System.out.println(name);



    }
}
