package com.zsl.creatobject;

//创建类
//一个java文件中可以定义多个class类，但只能有一个是publ修饰的
//而且public修饰的类型必须是文件名
//因此实际开发中还是建议一个java文件定义一个类
//类名一般要满足驼峰模式，首字母大写
//其实叫无参数构造器
public class CarDemo01 {
    //属性（成员变量）
    //注意事项： 类内成员变量一般不需要给定初始值
    String name;
    double price;

    //行为（方法）
    public void start(){
        System.out.println(name + "，价格是：" + price + "启动了~~~");
    }
    public void run(){
        System.out.println(name + "，价格是：" + price + "跑的很快~~~");
    }




}
