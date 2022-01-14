package com.zsl.type;

public class TypeDemo {
    public static void main(String[] args) {
//        自动类型转换
//        小范围赋值给大范围
        byte a =20;
        int b = a;
        System.out.println(b);
//        byte占一个字节8位 0001100 第一个0表示正号 而int占4个字节 占4x8位
//        自动转换：byte-short-int-long-float-double 此外char-int  char是2个字节 double占8个字节
        char c = 'a';
        int d = c;
        System.out.println(c);
        System.out.println(d);

//        运算过程类型自动转换 即byte char short类型参与运算时会自动转换为int
        byte x = 1;
        byte y = 2;
//        如果计算x+y，那结果要用int类型输出
        int z = x + y;
//        这样写会报错：char z2 = x + y;
        System.out.println(z);

//        强制类型转换：大范围类型变量赋值到小范围 例如int到byte
        int e = 130;
//        直接把大转小会报错：byte f = e; 在e前面alt + 回车 会有万能提示
        byte f = (byte) e;
        System.out.println(f);
//        浮点型强转整数型时会丢失小数部分


    }
}
