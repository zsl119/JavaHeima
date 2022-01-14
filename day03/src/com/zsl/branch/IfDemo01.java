package com.zsl.branch;

public class IfDemo01 {
    public static void main(String[] args) {
        //当心跳在60-100之前时为正常，否则进行下一步检查
        int heart = 108;
        if (heart >= 60 && heart <= 100){ //只有一行代码时 {}可以省略
            System.out.println("心率正常");
        }else if (heart < 60){
            System.out.println("心率过低");
        }else{
            System.out.println("心率过高");
        }
    }
}
