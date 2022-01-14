package com.zsl.constructor;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.name);
        System.out.println(car1.price);

        Car car2 = new Car("宝马X6", 80);

        Train train1 = new Train();
        System.out.println(train1.name);
        System.out.println(train1.price);
    }
}
