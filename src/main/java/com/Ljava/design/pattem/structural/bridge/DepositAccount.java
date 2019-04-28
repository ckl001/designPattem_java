package com.Ljava.design.pattem.structural.bridge;

/**
 * @Auther 20173
 * @Date 2019-4-9 15:02
 * @Des 定期 账户
 **/
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账户。。。");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户！");
    }
}
