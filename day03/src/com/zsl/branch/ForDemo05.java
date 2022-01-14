package com.zsl.branch;

public class ForDemo05 {
    public static void main(String[] args) {
        //for循环输出1加到10的和
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);

        //求1-100奇数和
        int sum2 = 0;
        for (int j = 1; j <= 100; j += 2){
            sum2 += j;
        }
        System.out.println(sum2);
    }
}
