package com.zsl.arraylist;

public class Student {
    private String id;
    private String name;
    private int age;
    private String banji;

    public Student() {
    }

    public Student(String id, String name, int age, String banji) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.banji = banji;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }
}
