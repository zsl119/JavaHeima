package com.zsl.creatobject;
//在同一个包下时，引包操作可省去

public class CarTest01 {
    //为了测试CarDemo01类
    public static void main(String[] args) {
        //自己设计对象并使用
        //类名 对象名 = new 类名();
        CarDemo01 car = new CarDemo01();
        //new了对象之后，如何使用：访问属性/访问行为
        car.name = "AE86";
        car.price = 8888.88;
        System.out.println(car.name);
        System.out.println(car.price);
        car.start();
        car.run();
    }

}
