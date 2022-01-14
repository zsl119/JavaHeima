package com.zsl.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);//可以访问和赋值名字
        //s.age;//无法访问年龄
        s.setAge(18);
        System.out.println(s.getAge());
    }
}
