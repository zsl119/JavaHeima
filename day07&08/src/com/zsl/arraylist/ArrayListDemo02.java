package com.zsl.arraylist;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //ArrayList对泛型类的支持
        //ArrayList<E>：表示一个泛型类，表示此集合只能操作某种类型变量

        ArrayList<String> arrayString = new ArrayList<>();//后面String的可省略不写
        //arrayString.add(12);//存入整数会报错
        arrayString.add("12");//只能存字符串
        arrayString.add("中国");//只能存字符串
        arrayString.add("你好");//只能存字符串

        //要养成使用泛型定义集合的习惯。这样才规范

        int size = arrayString.size();
        System.out.println(size);

        String element = arrayString.get(1);
        System.out.println(element);

        //遍历
        for (int i = 0; i < arrayString.size(); i++) {
            System.out.println(arrayString.get(i));
        }


        //删除某个索引对应的元素
        arrayString.remove(1);//删除“中国”
        System.out.println(arrayString);//[12, 你好]
        //直接删除某个元素，删除成功返回true
        System.out.println(arrayString.remove("12"));//删除"12" 输出true
        System.out.println(arrayString);//[你好]

        //修改某个索引位置元素值
        arrayString.set(0,"大家好");//”你好“ 修改为 “大家好”
        System.out.println(arrayString);//[大家好]


    }
}
