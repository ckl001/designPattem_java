package com.Ljava.design.pattem.structural.bridge;

/**
 * @Auther 20173
 * @Date 2019-4-9 14:56
 * @Des 中国农业银行
 **/
public class ABCBank extends Bank{

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行的账户。。。");
        account.openAccount();
        return account;
    }
}
