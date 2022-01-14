package com.zsl.branch;

public class BreakandContinueDemo11 {
    public static void main(String[] args) {
        //break跳出循环
        //continue跳过当前循环的当次循环，执行下一次循环
        int i = 0;
        while (true) {
            if (i == 6) {
                i++;
                continue;
            } else {
                System.out.println(i);
                i++;
                }
            if (i == 10) {
                break;
            }
        }
    }
}
