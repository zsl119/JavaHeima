package com.zsl.atm;

public class Account {
    // 定义账户类，用于后期封装用户的账户信息
    // 卡号，密码，姓名，存款，取现额度
    private String cardId;
    private String passWord;
    private String userName;
    private double money;
    private double cash;

    public Account() {
    }

    public Account(String cardId, String passWord, String userName, double cash) {
        this.cardId = cardId;
        this.passWord = passWord;
        this.userName = userName;
        this.cash = cash;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
