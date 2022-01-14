package com.zsl.encapsulation;

public class Student {
    //封装实现步骤
    //对成员变量priva私有
    String name;
    private int age;
    //当对一个变量私有后
    //一般提供public修饰的公开的getter方法和setter方法来修饰

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150){
            this.age = age;
        }else
            System.out.println("请输入合理年龄");

    }

    //以上操作就完成了一个类的封装，对age的封装
}
