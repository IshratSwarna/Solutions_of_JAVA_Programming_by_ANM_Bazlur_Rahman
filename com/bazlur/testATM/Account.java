package com.bazlur.testATM;

public class Account {
    public String accountNo;
    public String password;
    public double balance;

    public Account(String accountNo, String password, double balance){
        this.accountNo = accountNo;
        this.password = password;
        this.balance = balance;
    }
}
