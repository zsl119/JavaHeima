package com.zsl.random;

import java.util.Random;
import java.util.Scanner;

public class RandomGameDemo02 {
    public static void main(String[] args) {
        //随机生成一个1-100的数据，用户猜测，提示过大过小 直到猜中为止
        Random r = new Random();
        int data = r.nextInt(100) + 1;
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("猜数字游戏已开始");
        while (true){
            System.out.println("请输入你的答案：");
            int answer = s.nextInt();
            if (answer == data){
                count++;
                System.out.println("恭喜您回答正确！您共计回答" + count + "次");
                break;
            } else if (answer > data){
                count++;
                System.out.println("回答错误，你输入的答案" + answer + "偏大");
            } else {
                count++;
                System.out.println("回答错误，你输入的答案" + answer + "偏小");
            }
        }

    }
}
