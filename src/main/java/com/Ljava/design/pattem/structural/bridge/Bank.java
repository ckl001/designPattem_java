package com.Ljava.design.pattem.structural.bridge;

/**
 *  银行抽象
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
