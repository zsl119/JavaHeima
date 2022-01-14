package com.zsl.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //动态初始化数组定义：定义时只定义数组类型和长度
        int[] arr = new int[3];//不赋值，其实存的是默认值0 0 0
        System.out.println(arr[0]);//输出0
        arr[0] = 5;//赋值
        System.out.println(arr[0]);//输出5

        //同理String的默认值是null
        String[] names = new String[5];
        System.out.println(names[0]);//输出是null
        names[0] = "迪丽热巴";
        System.out.println(names[0]);//输出迪丽热巴

        System.out.println("--------------------------------");
        //两种写法严格区分
        //静态数组初始化
        int[] st = {1,2,4,6,86};
        //动态数组初始化
        int[] dy = new int[5];
        //两种格式不可混用






    }
}
