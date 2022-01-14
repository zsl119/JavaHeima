package com.zsl.variable;

public class Variable {
    public static void main(String[] args) {
//        学会使用变量
//        数据类型 变量名称 = 初始值；
        double money = 6.0;
        System.out.println(money);

        money = money + 4.0;
        System.out.println(money);

        System.out.println("-------------------------------");
        int age = 21;

//        字符串定义
        String name = "赵时临";
        System.out.println(name);

//        单字符定义 单引号 两个字节
//        也就是00000000 00000000
//        8个0是一个字节
        char a = '中';
        System.out.println("命名规范");
        System.out.println("变量名称满足小驼峰：首字母小写中间一个字母大写 int studyNumber = 77");
        System.out.println("类名称满足小驼峰：首字母大写中间一个字母大写 HelloWorld.java");
    }
}
