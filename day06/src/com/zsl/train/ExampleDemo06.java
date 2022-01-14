package com.zsl.train;

import java.util.Scanner;

public class ExampleDemo06 {
    public static void main(String[] args) {
        //数字加密
        Scanner sc = new Scanner(System.in);
        System.out.print("输入原始密码（4位）：");
        int ori = sc.nextInt();
        int[] oriCode = new int[4];
        oriCode[0] = ori / 1000;
        oriCode[1] = ori / 100 % 10;
        oriCode[2] = ori / 10 % 10;
        oriCode[3] = ori % 10;

        System.out.println("输出加密密码（4位）：" + secCode(oriCode));


    }
    public static int secCode(int[] arr){
        int newCode = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - i -1];
            arr[arr.length - i -1] = arr[i];
            arr[i] = temp;
        }
        newCode = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
        return newCode;
    }
}

