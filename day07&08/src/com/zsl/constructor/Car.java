package com.zsl.constructor;
//定义一个类
public class Car {
    String name;
    int price;
    //无参数构造器
    public Car(){
        System.out.println("这是一个无参数构造器");
    }
    //有参数构造器
    public Car(String n, int p){
        name = n;
        price = p;
        System.out.println(name);
        System.out.println(price);
        System.out.println("这是一个有参数构造器");
    }


}
