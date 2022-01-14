package com.zsl.branch;

public class SwitchDemo03 {
    public static void main(String[] args) {
        //switch穿透性案例 case中没有break就会穿透
        //输入月份 查询天数
        int month = 2;
        switch (month){
            case 1 :
            case 3:
            case 5:
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println(month + "月31天");
                break;
            case 2 :
                System.out.println(month + "月28天");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println(month + "月30天");
                break;


        }
    }
}
