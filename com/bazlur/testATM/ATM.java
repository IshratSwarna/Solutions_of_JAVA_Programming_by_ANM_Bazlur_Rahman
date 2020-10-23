package com.bazlur.testATM;
import java.util.Scanner;

public class ATM {
    public void showMenu(){
        System.out.println("Main Menu");
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Exit");
        System.out.println("Enter Your Choice: ");
    }
    public static void main(String[] args) {
        AccountInfo accountInfo = new AccountInfo();
        String accountNo;
        String password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your account no:");
        accountNo = scanner.next();
        System.out.println("Enter your password:");
        password = scanner.next();
        
        int index = accountInfo.getAuthentication(accountNo, password);

        if(index == -1){
            System.out.println("Try Again Later.");
        }
        else{
            System.out.println("Login Successful.");
            ATM atm = new ATM();
            while(true){
                atm.showMenu();
                int choice = scanner.nextInt();
                if(choice == 1){
                    //check balanace
                    double balance = accountInfo.checkBalance(index);
                    System.out.println("Your Current Account Balance is "+balance+" TK.");
                }
                else if(choice == 2){
                    //withdraw
                    System.out.println("Enter Amount to withdraw :");
                    double money = scanner.nextDouble();
                    double newBalance = accountInfo.withdrawMoney(index, money);
                    if(newBalance == -1){
                        System.out.println("Sorry, You have not sufficient balance.");
                    }
                    else{
                        System.out.println("Successfully Withdrawed.Your New Account Balance is "+newBalance+" TK.");
                    }
                }
                else{
                    break;
                }
            } 
        }
    }
}
