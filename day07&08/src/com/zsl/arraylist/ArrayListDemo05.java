package com.zsl.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo05 {
    public static void main(String[] args) {
        // 学生信息系统的数据搜索
        // 根据学号来搜索学生姓名
        // 定义一个学生类 来封装学生信息
        // 再定义一个集合 存储学生信息
        ArrayList<Student> students = new ArrayList<>();
        Student s0 = new Student("2017011253", "赵时临", 22, "自动化17-1" );
        students.add(s0);
        students.add(new Student("2017011251", "张上文", 23, "自动化17-1"));
        students.add(new Student("2017011252", "张维文", 23, "自动化17-1"));
        students.add(new Student("2017011255", "周建桥", 23, "自动化17-1"));
        students.add(new Student("2017011256", "朱经轮", 23, "自动化17-1"));

        // 遍历
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("学号：" + s.getId());
            System.out.println("名字：" + s.getName());
            System.out.println("年龄：" + s.getAge());
            System.out.println("班级：" + s.getBanji());
            System.out.println("-------------------- ");
        }

        // 调用查询方法
        Scanner sc = new Scanner(System.in);
        while (true) {
            //写完之后加while循环 ctrl alt t

            System.out.print("请输入学号：");
            String i = sc.next();
            Student student = search(students, i);//用学生类对象来接一下s

            //判断学生是否存在
            if (student == null){
                System.out.println("查无此人");
            }

        }


    }

    // 定义一个方法，根据学号搜索姓名
    // 返回值类型 输入值类型
    // 返回值类型可以直接是学生类 输入值可以是学生集合
    public static Student search(ArrayList<Student> students,String id){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(id)){
                //students是集合，第一个get(i)获取集合里的对象，第二个getId获取该对象的学号
                System.out.println( "该学生的姓名是" + s.getName());
                return s;
            }
        }
        //在这里不能return s;  因为s定义在for循环内，这里返回null即可
        return null;

    }


}
