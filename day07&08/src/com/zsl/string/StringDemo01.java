package com.zsl.string;

public class StringDemo01 {
    public static void main(String[] args) {
        //创建字符串对象的几种方式
        //1.直接创建
        String s1 = "直接创建";
        //2.将字符数组转换成字符串
        char[] c1 = {'a', 'b', 'c', '中', '国'};
        String s2 = new String(c1);
        System.out.println(s2);
        //3.将字节数组转换成字符串
        byte[] b1 = {97, 98, 65, 66};//直接数组范围-128-127
        String s3 = new String(b1);
        System.out.println(s3);//结果并不是97986566，而是会自动把97,98,65,66转换成对应的字符

    }

}

