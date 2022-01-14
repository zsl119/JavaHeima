package com.zsl.traverse;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //遍历数组
        int[] arr = {1,32,34,56,43,14};
        //for循环使用技巧 fori回车
        //遍历技巧arr.length.fori回车
        //并求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println("-------------------------");
        //找出数组最大值
        int[] yz = {445,448,1000,3666,34300,656,6785};
        //定义一个最大值，一般假设数组第一个值为最大值
        int max = yz[0];
        for (int i = 0; i < yz.length; i++) {
            if(yz[i] > max){
                max = yz[i];
            }
        }
        System.out.println(max);
    }
}
