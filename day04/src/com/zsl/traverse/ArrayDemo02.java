package com.zsl.traverse;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //猜数字游戏
        //游戏后台随机生成5个1-20的数，用户去猜，未猜中则提示：猜错了，请继续
        //猜中则输出：真棒，猜中了  并输出猜的次数以及该数值第一次出现的位置
        int[] num = new int[5];
        Random ra = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = ra.nextInt(20) + 1;//把1-20随机数赋值给数组
            //System.out.print(num[i] + "\t");
        }
        System.out.println("猜数字游戏开始！");
        System.out.println("请输入你的答案：");

        Scanner sc = new Scanner(System.in);
        int count = 0;
        OUT:
        while (true){
            int answer = sc.nextInt();
            count++;
            for (int i = 0; i < num.length; i++) {
                if (num[i] == answer) {
                    System.out.println("真棒，猜中了\n你一共猜了" + count + "次");
                    System.out.println("该数字第一次出现在数组的第" + (i + 1) + "个位置");
                    System.out.println("请继续下一轮");
                    //break;//直接break只能结束for循环，无法结束while循环
                    break OUT;//在while上一行加一个OUT:
                }
            }
            System.out.println("猜错了，请继续");
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");

        }

    }
}
