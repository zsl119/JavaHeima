package com.zsl.shop;

import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {
        //先定义一个商品类，用于new出各种各样商品
        // 定义购物车数组
        Goods[] shopCar = new Goods[10];//购物车容量为10
        //      shopCar = {null, null ...}
        //搭建界面操作架构，让用户选择操作的功能
        while (true) {
            System.out.println("请选择如下命令进行操作");
            System.out.println("添加商品：add");
            System.out.println("查看商品：query");
            System.out.println("修改数量：update");
            System.out.println("结算价格：pay");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的命令：");
            String choice = sc.next();
            switch (choice) {
                case "add":
                    //添加商品
                    //直接写一个添加购物车的方法（不是类）
                    //alt + 回车 自动补齐
                    addGoods(shopCar, sc);
                    break;
                //意外着添加完购物车程序就结束了
                //所以如果我们需要继续操作，就应该在操作界面做循环
                //选中12行到46行 ctrl alt T
                case "query":
                    //查看商品
                    queryGoods(shopCar);
                    break;
                case "update":
                    //修改数量
                    //让用户输入商品id,找出对应商品再修改其数量
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                    //结算价格
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("您输入的指令有误");
                    break;
            }
        }

    }



    public static void addGoods(Goods[] shopCar, Scanner sc) {
        //1.录入用户输入的购买商品信息
        //2.上面有一个扫描器了，所以没必要再创建，这个方法接一下就行
        System.out.println("输入商品编号");
        int id = sc.nextInt();
        System.out.println("输入商品名称");
        String name = sc.next();
        System.out.println("输入商品价格");
        double price = sc.nextDouble();
        System.out.println("输入商品数量");
        int buyNumber = sc.nextInt();

        //把商品的信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.buyNumber = buyNumber;
        g.name = name;
        g.price = price;

        //把这个商品对象添加到购物车
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                //说明此位置没有元素存入
                shopCar[i] = g;
                System.out.println("您的商品" + g.name + "添加到购物车完成");
                break;
            }
        }
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("===============购物车查询信息如下================");
        System.out.println("编号\t\t名称\t\t价格\t\t数量");
        //shopCar = {g1, g2, g3, null, null...}
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];//找一个变量接一下要查询的商品
            if (shopCar[i] != null){
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.buyNumber);
            }else
                break;
        }
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请输入要修改数量的商品id：");
        int id = sc.nextInt();
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null && shopCar[i].id == id){
                System.out.println("该商品名称是：" + shopCar[i].name);
                System.out.print("请输入要修改的数量：");
                int buyNumber = sc.nextInt();
                shopCar[i].buyNumber = buyNumber;
                System.out.println("该商品数量已修改为：" + shopCar[i].buyNumber);
                break;
            }else{
                System.out.println("未找到该商品");
                break;
            }
        }
    }

    public static void payGoods(Goods[] shopCar) {
        System.out.println("您的购物车目前已添加商品：");
        queryGoods(shopCar);
        System.out.println("您需要支付：");
        double sum = 0;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null && i != shopCar.length - 1){
                sum += shopCar[i].price * shopCar[i].buyNumber;
            }else{
                System.out.println(sum);
                break;
            }
        }

    }


}
