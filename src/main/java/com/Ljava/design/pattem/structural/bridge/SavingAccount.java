package com.Ljava.design.pattem.structural.bridge;

/**
 * @Auther 20173
 * @Date 2019-4-9 15:04
 * @Des 活期账户
 **/
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
