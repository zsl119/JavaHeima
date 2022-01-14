package com.zsl.method;

public class MethodDemo01 {
    public static void main(String[] args) {
        //方法是一种语法结构，它可以把一段代码封装为一个功能，以便方便重复调用
        //方法的优点
        //提高代码的复用性和开发效率，让程序逻辑更加清晰

        //张工
        int c1 = sum(10, 202);
        System.out.println(c1);

        //赵工
        sum2(1);
        //int c2 = c;//不能有这一句，方法内的变量只在方法内生效

        //李工
        print();


    }

    //方法是在main函数以外的函数
    //含参含返回值方法
    public static int sum(int a, int b){
        //int表示该方法执行后返回一个int型变量
        //sum是该变量的名称
        //a,b是两个用来接数据的参数
        return a + b;//return就是方法的返回命令，相当于把c交给sum输出
    }

    //含参无返回值方法,即不含return语句
    public  static void sum2(int a){
        int c = a * a;
        //return c;//不能有这一句 因为void表示无返回值

    }

    //无参无返回值方法
    public  static void print(){
        System.out.println("这是一个无参无返回值方法");
        System.out.println("这是一个无参无返回值方法");
        System.out.println("这是一个无参无返回值方法");

    }


}
