package com.zsl.javabean;

public class JavaBean {
    //JavaBean可理解为实体类，其对象可以用来在程序中封装数据
    //标准JavaBean需满足如下要求：
    // 成员变量使用private修饰
    // 提供每一个成员变量getXXX()和setXXX()
    //必须提供一个无参构造器
    private String name;
    private double height;
    private double salary;

    //右键-Generate-getter and setter-shift选中所有变量回车即可
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //必须要有无参数构造器，默认就有所以不用写
    //当要添加有参构造器时，也可以右键-Generate-Constructor
    public JavaBean(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }
    //一旦出现有参构造器，默认的无参构造器就会消失，所以要手动写
    //右键-Generate-Constructor-selectNone
    public JavaBean() {
    }

    //至此一个标准的JavaBean就写好了

}
