package com.zsl.train;

import java.util.Scanner;

public class ExampleDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("机票原价");
        double price = sc.nextDouble();

        System.out.println("机票月份");
        int month = sc.nextInt();

        System.out.println("机票舱位");
        String type = sc.next();

        System.out.println("实际价格：" + calc(price, month, type));


        //买飞机票
        //机票价格按照淡季旺季、头等舱经济舱收费。输入机票原价，月份和头等舱或经济舱
        //按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折；
        //                     淡季（11-4月）头等舱7折，经济舱6.5折；
    }

    public static double calc(double price, int month, String type){
        if (month >= 5 && month <= 10){
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
                default:
                    System.out.println("您输入的舱位有误");
                    price = -1;
                    break;
            }
        }else if (month == 11 || month == 12 || month >= 1 && month <= 4){
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
                default:
                    System.out.println("您输入的舱位有误");
                    price = -1;
                    break;
            }
        }else {
            System.out.println("您输入的月份有误");
            price = -1;
        }
        return price;

    }
}
