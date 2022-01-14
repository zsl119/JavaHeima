package com.zsl.train;

import java.util.Scanner;

public class ExampleDemo05 {
    public static void main(String[] args) {
        //评委打分，求最后得分；6位评委 去掉最高最低 返回平均分
        //录入6位评委分数
        double[] scores = new double[6];

        System.out.println("请录入6位老师打分结果：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextDouble();
        }

        System.out.println("6位老师依次打分为：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        System.out.println();
        System.out.println("去掉最高最低分后，最后平均分为：");
        System.out.println(finalScore(scores));

    }
    
    public static double finalScore(double arr[]){
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }else if (arr[i] < min){
                min = arr[i];
            }
            //计算总分还可以直接把所有人分数加起来，再减去最大最小值
            sum += arr[i];
        }
        return (sum - max - min)/ (arr.length - 2) + (sum - max - min) % (arr.length - 2);

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != max && arr[i] != min){
//                sum += arr[i];
//            }
//        }
//        return sum/ (arr.length - 2) + sum % (arr.length - 2);
    }


    
}
