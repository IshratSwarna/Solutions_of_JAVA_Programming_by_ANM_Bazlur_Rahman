import java.util.Scanner;

public class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int choice,result,a=0,b=0;
        do{
            System.out.println("Please choose: ");
            System.out.println("1 for addition");
            System.out.println("2 for subtraction");
            System.out.println("3 for multiplication");
            System.out.println("4 for division");
            System.out.println("0 for quit");
            choice = scr.nextInt();

            if(choice > 0){
                System.out.println("Enter First Number : ");
                a = scr.nextInt();
                System.out.println("Enter Second Number : ");
                b = scr.nextInt();
            }
            switch(choice){
                case 1:
                    result = calculator.add(a,b);
                    System.out.println("Your result is: "+result);
                    break;
                case 2:
                    result = calculator.subtract(a,b);
                    System.out.println("Your result is: "+result);
                    break;
                case 3:
                    result = calculator.multiply(a,b);
                    System.out.println("Your result is: "+result);
                    break;
                case 4:
                    result = calculator.divide(a,b);
                    System.out.println("Your result is: "+result);
                    break;
                case 0:
                    break;
            }
        }while(choice != 0);
    }
}