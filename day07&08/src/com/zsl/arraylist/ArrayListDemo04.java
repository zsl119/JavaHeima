package com.zsl.arraylist;

import java.util.ArrayList;

public class ArrayListDemo04 {
    public static void main(String[] args) {
        // 存储自定义类型的集合 实际开发中最常用
        // 案例：某影院系统要在后台存储三部电影，然后依次展示
        // 分析：定义电影类 3个电影对象 定义一个集合储存三个对象
        // 创建电影对象并封装

        ArrayList<Movie> movies = new ArrayList<>();

        Movie m1 = new Movie("肖申克救赎", 9.5,"罗宾斯");
        Movie m2 = new Movie("让子弹飞", 9.6,"姜文");
        Movie m3 = new Movie("长津湖", 9.9,"吴京");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        //System.out.println(movies);// 输出会是3个对象地址
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("片名：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
            System.out.println("------------------------");
        }
    }
}
