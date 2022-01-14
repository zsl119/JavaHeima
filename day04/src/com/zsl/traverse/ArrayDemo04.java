package com.zsl.traverse;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //数组排序 数组升序降序
        //冒泡排序 选择排序 快速排序 插入排序...
        //数组搜索
        //二分搜索 分块搜索 哈希表查找

        //冒泡排序：每轮一个元素 与相邻元素比较 大的放在后面 不大就结束这一轮
        //每次从头开始两两比较 1>2 1,2交换 交换后大的就是2 再2,3比较，大的放后面
        //即第一轮下来后，效果时数组中最大值已经放在了最后一位！！！
        //排序次数比元素个数小1
        int[] arrs = {23, 34, 11, 6, 56, 77, 35};
        for (int i = 0; i < arrs.length - 1; i++) {
            //for (int j = i + 1; j < arrs.length; j++) {
            for (int j = 0; j < arrs.length - i - 1; j++) {
                if (arrs[j] > arrs[j+1]) {
                    int temp = arrs[j+1];
                    arrs[j+1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + "\t");
        }
    }
}
