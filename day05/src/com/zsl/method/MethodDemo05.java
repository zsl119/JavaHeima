package com.zsl.method;

public class MethodDemo05 {
    public static void main(String[] args) {
        fire();
        fire("日本");
        fire("日本", 1000);

    }

    //方法重载
    //同一个类中，出现多个方法名相同，但是形参列表不同，那么这些方法就是重载方法
    //发射一枚武器
    public static void fire(){
        System.out.println("默认发射1枚武器给米国");
    }
    public static void fire(String country){
        System.out.println("发射1枚武器给" + country);
    }
    public static void fire(String country, int number){
        System.out.println("发射" + number + "枚武器给" + country);
    }
    //与上面的只调换了形参顺序，就是一个新的重载
    public static void fire(int number,String country){
        System.out.println("发射" + number + "枚武器给" + country);
    }
    //下面这个重载就不行，因为和上面的一样的，只有形参名称不同是不可以的
//    public static void fire(String c, int n){
//        System.out.println("发射" + n + "枚武器给" + c);
//    }



    //只要同一个类中，方法名称相同，形参列表不同，就是重载方法
    //形参列表不同：形参个数、类型、顺序不同，不关心形参的名称

}
