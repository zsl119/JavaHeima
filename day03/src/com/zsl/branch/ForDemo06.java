package com.zsl.branch;

public class ForDemo06 {
    public static void main(String[] args) {
        //找出100-999水仙花数 并统计个数
        //水仙花数的个、十、百位的立方和等于其本身

        //定义水仙花数统计量
        int count = 0;
        for (int i = 100; i < 1000; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (i == ge * ge * ge + shi * shi * shi +bai * bai * bai ){
                System.out.print(i + "\t");// \t 表示空格
                count++;
            }
        }
        System.out.println();
        System.out.println("水仙花数个数为" + count);
    }
}
