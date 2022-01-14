package com.zsl.traverse;

import java.lang.module.FindException;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo03 {
    public static void main(String[] args) {
        //键盘录入5位员工编号，并随机顺序输出
        //随机排序
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("依次输入5位员工编号");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("录入完毕，当前顺序是:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
        System.out.println();
        System.out.println("随机排序结果：");

        //遍历数组中的每个元素 随机一个索引出来 让该元素与随机索引元素交换
        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            int index = r.nextInt(num.length);
            int temp = num[index];//该元素与随机索引元素交换
            num[index] = num[i];
            num[i] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }

    }
}
