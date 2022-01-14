package com.zsl.method;

public class MethodDemo04 {
    public static void main(String[] args) {
        int[] arrs = {12, 23, 23, 56, 22};
        printArray(arrs);
    }

    public static void printArray(int[] arrs) {
        System.out.print("[");
        //还有另一种写法
        if (arrs != null && arrs.length > 0){
            for (int i = 0; i < arrs.length; i++) {
                System.out.print(i == arrs.length - 1 ? arrs[i] : arrs[i] + ",");
            }
        }

        System.out.print("]");
    }
}