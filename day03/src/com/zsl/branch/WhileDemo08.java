package com.zsl.branch;

public class WhileDemo08 {
    public static void main(String[] args) {
        //while循环用于不知道要循环多少次时用
        //for循环用于知道循环多少次时用
        //for循环和while循环都是先判断条件，再执行

        //示例：用0.1mm厚度对折，折叠多少次后比珠峰还高
        //珠峰高度8848.86m 也即8848860mm
        double peak = 8848860;
        double thick = 0.1;
        int count = 0;
        while (thick <= peak){
            thick *= 2;
            count++;
        }
        System.out.println("折叠" + count + "次后， 纸张厚度比珠峰还高");
    }
}
