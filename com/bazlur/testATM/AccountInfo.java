package com.bazlur.testATM;

public class AccountInfo {
    public Account[] accounts = new Account[5];

    public AccountInfo(){
        accounts[0] = new Account("12345","0123",1000.0);
        accounts[1] = new Account("12462486","j3GbAeY6",1000.0);
        accounts[2] = new Account("21345","0123",1000.0);
        accounts[3] = new Account("31245","0123",1000.0);
        accounts[4] = new Account("51235","0123",1000.0);
    }

    public int getAuthentication(String accountNo, String password){
        
        for(int i=0; i<accounts.length; i++){
            if( accounts[i].accountNo.equals(accountNo) && accounts[i].password.equals(password) ){
                return i;
            }
        }
        return -1;
    }

    public double checkBalance(int index){
        return accounts[index].balance;
    }
    public double withdrawMoney(int index, double money){
        if(money > accounts[index].balance){
            return -1.0;
        }
        accounts[index].balance -= money;
        double newBalance = accounts[index].balance;
        return newBalance;
    }
}
