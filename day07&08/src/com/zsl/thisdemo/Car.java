package com.zsl.thisdemo;

public class Car {
    String name;
    int price;
    public Car(String name, int price){
        //原本的意图是想把形参name和price赋值给外面的name和price
        //但实际上因为左右变量名称一致，程序只会调用形参
        //name = name;
        //price = price;
        //此时就需要this的用法
        this.name = name;
        this.price = price;
    }
    public Car(String name){
        System.out.println(this.name + "正在和" + name + "比赛");
    }
}
