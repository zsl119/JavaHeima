package com.zsl.train;

public class ExampleDemo02 {
    public static void main(String[] args) {
        //找出101-200的所有素数
        for (int i = 101; i <= 200 ; i++) {

            //信号位：标记
            //假定前提是素数
            boolean flag = true;

            for (int j = 2; j <= i/2 ; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }

            //如果循环了一圈后发现flag还是true，那说明该数是素数
            if (flag == true){
                System.out.print(i + "\t");
            }

        }



        //找出101-200的所有素数
//        for (int i = 101; i <= 200 ; i++) {
//            for (int j = 2; j <= i / 2 ; j++) {
//                int ys = i % j;
//                //判断是否整除
//                if (ys != 0){
//                    if (j == i/2){
//                        //如果不整除，且j遍历到了一半，那就输出这个数
//                        System.out.print(i + "\t");
//                    }
//                }else
//                    //如果整除，直接退出j循环，进入i循环，实现i++
//                    break;
//            }
//        }
    }
}
