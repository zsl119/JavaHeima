package com.zsl.branch;

public class SwitchDemo02 {
    public static void main(String[] args) {
        //匹配条件执行分支 适合做值匹配
        //匹配到哪个case值就去执行哪个case内的代码，遇到break就跳出
        //如果case都不匹配就执行defaul
        // 目标：学会使用switch分支结构，理解流程
        // 周一：埋头苦干，解决bug                             周五：今晚吃鸡
        // 周二：请求大牛程序员帮忙                             周六：与王婆介绍的小芳相亲
        // 周三：今晚啤酒、龙虾、小烧烤                          周日：郁郁寡欢、准备上班。
        // 周四： 主动帮助新来的女程序解决bug
        String weekday = "周二";
        switch (weekday) {
            case "周一":
                System.out.println("埋头苦干，解决bug ");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("郁郁寡欢、准备上班");
                break;
            default:
                System.out.println("数据有误！");
        }
    }
}

