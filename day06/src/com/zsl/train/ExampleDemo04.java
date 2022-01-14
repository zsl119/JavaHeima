package com.zsl.train;

public class ExampleDemo04 {
    //数组元素复制
    //数组不是值把两个数组名称的不同的数组指向一个地址内存
    //而是要创建两个不同的数组
    public static void main(String[] args) {
        int[] arr1 = {11,22,23,24,15};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("复制后新数组：[");
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1){
                System.out.print(arr2[i]);
            }else
            System.out.print(arr2[i] + ",");
        }
        System.out.print("]");
    }
}
