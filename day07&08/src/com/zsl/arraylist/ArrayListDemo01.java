package com.zsl.arraylist;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //ArrayList集合
        ArrayList list = new ArrayList();

        //添加数据
        list.add("你好");
        list.add(20);
        list.add('中');
        list.add(false);

        System.out.println(list.add(false));//一般输出都是true，表示往集合添加数据成功
        System.out.println(list);//[你好, 20, 中, false]

        //指定索引插入元素
        list.add(1,"新插入元素");
        System.out.println(list);


    }
}
