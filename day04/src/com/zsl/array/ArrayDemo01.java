package com.zsl.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //静态初始化数组定义： 数据类型[] 数组名称 = new 数据类型[]{ ， ， ， ， };
        double[] scores = new double[]{61,12,33,78,97,54,3};
        int[] ages = new int[]{12,23,42,12,13,14};
        String[] names = new String[]{"zhangsan","lisi","wangwu"};

        //但是这样写太麻烦，一般用简化写法
        int[] height = {156,124,156,144,167};

        //数组类型是引用数据类型，数组变量名存储的是数组在内存中的地址信息
        System.out.println(ages);//输出结果是地址信息：[I@119d7047
        System.out.println("-------------------");
        //那么如何访问数组中的信息呢 数组名称[访问第几个数组就写几，从0开始]
        System.out.println(height[0]);
        System.out.println(height[1]);
        System.out.println(height[2]);
        //数组长度输出，也即元素个数输出
        System.out.println(height.length);
        //输出最大索引值 索引值就是往[]里写的那个值
        System.out.println(height.length - 1);//前提是数组内元素个数不为0


    }
}
