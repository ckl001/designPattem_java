package com.Ljava.design.pattem.structural.bridge;

/**
 * @Auther 20173
 * @Date 2019-4-9 15:00
 * @Des 中国工商银行
 **/
public class ICBCBank extends Bank{

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
