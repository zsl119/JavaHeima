package com.zsl.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        // 创建账户集合 负责存储账户对象
        ArrayList<Account> accounts = new ArrayList<>();

        // 准备系统首页，包括登录和注册（开户）
        // 写完之后最好把它独立成一个方法
        showMain(accounts);// 这个accounts是账户集合
        // 而且开户时要用到accounts集合，所以该方法（构造器）要传入accounts

        // 开户功能设计，依然独立成一个方法


    }
    public static void showMain(ArrayList<Account> accounts){
        // 这个accounts是形参
        // 准备系统首页，包括登录和注册（开户）
        // 写完之后最好把它独立成一个方法
        System.out.println("============ATM系统首页===========");
        System.out.println("欢迎使用！");
        flag:
        while (true) {
            System.out.println("1.登录");
            System.out.println("2.开户");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            //ctrl + alt + t
            System.out.print("请输入您想做的操作：");
            switch (sc.nextInt()){
                case 1 :
                    System.out.println("登录操作");
                    login(accounts,sc);
                    // ctrl + 鼠标单击方法名称快速跳转
                    // alt + 回车   快捷创建方法
                    break;//跳出switch循环，但没有跳出while循环
                case 2 :
                    System.out.println("开户操作：");
                    regist(accounts);
                    continue;
                case 3 :
                    System.out.println("退出系统！");
                    break flag;
                    //在外层循环前加上flag: 就可以直接跳出
                default:
                    System.out.println("您输入的内容有误，请重新输入");
                    continue;
            }
        }
    }

    /**
     * 登录
     * @param accounts
     * @param cardId
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("============用户登录界面============");
        if (accounts.size() == 0){
            System.out.println("没有任何账户");
            return;
        }
        System.out.println("请输入8位卡号");
        String cardId = sc.next();
        Account ac = getAccountByCardID(accounts,cardId);
            if (ac == null){
                System.out.println("查无此账户，重新输入卡号");
            }else {
                while (true) {
                    System.out.println("请输入密码：");
                    String passWord = sc.next();
                    if (ac.getPassWord().equals(passWord)){
                        System.out.println("登录成功");
                        // 该进入下一个界面了
                        showCommand(sc, ac,accounts);
                        return;//结束登录方法，回到首页
                    }else {
                        System.out.println("密码错误");
                    }
                }
            }
    }

    private static void showCommand(Scanner sc, Account ac, ArrayList<Account> accounts) {

        while (true) {
            System.out.println("===============用户操作界面===============");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.改密");
            System.out.println("6.退出");
            System.out.println("7.销号");
            System.out.print("请输入您想做的操作：");
            switch (sc.nextInt()){
                case 1 :
                    // 显然查询只能查自己已经登录成功的账户
                    // 所以方法要送入登录成功的账户ac
                    // 展示账户信息也做成方法
                    showAccount(ac);
                    break;
                case 2 :
                    depositMoney(ac,sc);
                    break;
                case 3 :
                    drawMoney(ac,sc);
                    break;
                case 4 :
                    transforMoney(accounts,ac,sc);
                    break;
                case 5 :
                    updatePassWord(ac,sc);
                    break;
                case 6 :
                    // 结束用户操作方法 回到登录界面
                    return;
                case 7 :
                    deleteAccount(accounts,ac,sc);
                    return;
                default:
                    System.out.println("输入命令有误，重新输入");

            }
        }
    }

    private static void deleteAccount(ArrayList<Account> accounts, Account ac, Scanner sc) {
        if (ac.getMoney() != 0){
            System.out.println("销户前请确认卡内余额为0！");
            return;
        }
        System.out.println("销户操作不可逆转，请二次确实是否销户");
        System.out.println("1.确认");
        System.out.println("2.取消");
        switch (sc.nextInt()){
            case 1 :
                break;
            case 2 :
                return;
            default:
                System.out.println("输入指令有误");
                return;
        }
        System.out.println("请输入密码");
        String passWord = sc.next();
        if (ac.getPassWord().equals(passWord)){
            accounts.remove(ac);
            System.out.println("销户成功");
            return;
        }else{
            System.out.println("密码错误！");
            return;
        }
    }

    private static void updatePassWord(Account ac, Scanner sc) {
        while (true) {
            System.out.print("请输入原密码：");
            String passWord = sc.next();
            System.out.print("请输入新密码：");
            String newPassWord = sc.next();
            System.out.print("请重复新密码：");
            String newPassWord2 = sc.next();
            if (ac.getPassWord().equals(passWord) && newPassWord.equals(newPassWord2)){
                ac.setPassWord(newPassWord);
                System.out.println("密码修改成功");
                return;
            }else {
                System.out.println("原密码输入错误或两次新密码输入不一致！");
                System.out.println("密码修改失败！");
            }
        }
    }

    private static void transforMoney(ArrayList<Account> accounts, Account ac, Scanner sc) {
        System.out.println("===========转账界面==========");
        if (accounts.size() < 2){
            System.out.println("目前系统账户数目不足2个，无法完成转账业务！");
            return;
        }else if (ac.getMoney() == 0){
            System.out.println("您的账户余额为0，请先存款");
        }

        while (true) {
            System.out.print("请输入您要转账的卡号：");
            String cardId = sc.next();
            Account transforAc = getAccountByCardID(accounts,cardId);
            if (transforAc == null){
                System.out.print("您输入的卡号不存在，请重新输入：");
                continue;
            }
            System.out.print("请输入转账人的姓名：");
            String transforName = sc.next();
            if (transforAc.getUserName().equals(transforName)){
                System.out.print("请输入转账金额：");
                double transforMoney = sc.nextDouble();
                if (transforMoney > ac.getCash() && transforMoney <= ac.getMoney()){
                    System.out.println("单次转账金额超出限制额度：" + ac.getCash() + "元，请重新输入转账金额");
                }else if (transforMoney > ac.getMoney()){
                    System.out.println("余额不足，请重新输入转账金额");
                }else {
                    ac.setMoney(ac.getMoney() - transforMoney);
                    transforAc.setMoney(transforAc.getMoney() + transforMoney);
                    System.out.println("转账成功，转账" + transforMoney + "元，目前余额：" + ac.getMoney() + "元");
                    return;
                }

            }else{
                System.out.println("姓名输入错误，无法完成转账业务");
                continue;
            }

        }

    }

    private static void drawMoney(Account ac,Scanner sc) {
        while (true) {
            if (ac.getMoney() == 0){
                System.out.println("您的账户余额为0！无法完成取款操作");
                return;
            }else {
                System.out.println("请输入取款金额：");
                double drawMoney = sc.nextDouble();
                if (drawMoney > ac.getCash() && drawMoney <= ac.getMoney()){
                    System.out.println("单次取款金额超出限制额度：" + ac.getCash() + "元，请重新输入取款金额");
                }else if (drawMoney > ac.getMoney()){
                    System.out.println("余额不足，请重新输入取款金额");
                }else {
                    ac.setMoney(ac.getMoney() - drawMoney);
                    System.out.println("取款成功，取款" + drawMoney + "元，目前余额：" + ac.getMoney() + "元");
                    return;
                }
            }
        }
    }

    private static void depositMoney(Account ac,Scanner sc) {
        System.out.println("请输入要存款的金额：");
        double money = sc.nextDouble();
        ac.setMoney(ac.getMoney() + money);
        System.out.println("存款完成");
        showAccount(ac);
    }

    private static void showAccount(Account ac) {
        System.out.println("=========当前账户详情=========");
        System.out.println("卡号：" + ac.getCardId());
        System.out.println("姓名：" + ac.getUserName());
        System.out.println("存款：" + ac.getMoney());
        System.out.println("限额：" + ac.getCash());
    }

    // 标准注释 /** + 回车
    /**
     * 用户开户功能
     * @param accounts
     */

    public static void regist(ArrayList<Account> accounts){
        System.out.println("============用户注册界面===========");
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("姓名：");
            String userName = sc.next();
            System.out.println("密码：");
            String passWord = sc.next();
            System.out.println("确认密码：");
            String passWord2 = sc.next();
            System.out.println("取现额度：");
            double cash = sc.nextDouble();
            if (passWord2.equals(passWord) == false){
                System.out.println("两次密码不同");
                continue;
            }else{
                String cardId = creatCardId(accounts);
                System.out.println("恭喜您注册成功，卡号：" + cardId);
                //返回的是8位卡号，直接输出一下 再存到账户里
                //把数据存到账户直接一个有参构造器就行，不必用setXXX
                account =new Account(cardId, passWord, userName, cash);
                accounts.add(account);
                break;
            }
        }

        // 结果验证
//        System.out.println("账户数目：" + accounts.size());
//        for (int i = 0; i < accounts.size(); i++) {
//            Account ac = accounts.get(i);
//            System.out.println("账户：" + ac.getCardId() + "\t姓名：" + ac.getUserName() + "\t密码：" + ac.getPassWord() + "\t取现额度：" + ac.getCash());
//        }

    }

    // 生成卡号方法 同时保证账户集合里面的卡号与生成的不一样
    public static String creatCardId(ArrayList<Account> accounts){
        while (true) {
            Random ra = new Random();
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += ra.nextInt(10);
                // 可以直接把随机数送到String类型
            }
            Account ac = getAccountByCardID(accounts,cardId);
            if (ac == null){
                // 当前卡号没有重复
                // return语句结束方法
                // break语句结束循环
                return cardId;
            }
        }

    }

    // 根据卡号查询账户对象
    public static Account getAccountByCardID(ArrayList<Account> accounts, String cardID){
        for (int i = 0; i < accounts.size(); i++) {
            Account ac = accounts.get(i);
            if (ac.getCardId().equals(cardID)){
                return ac;
            }
        }
        return null;//查无此账户
    }

}
