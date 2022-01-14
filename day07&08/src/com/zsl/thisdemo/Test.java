package com.zsl.thisdemo;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("宝马",80);
        System.out.println(car1.name);
        System.out.println(car1.price);
        //输出的名字和价格不是宝马 80
        //而是null 0
        //此时就需要this的用法

        Car car2 = new Car("奔驰");
    }
}
