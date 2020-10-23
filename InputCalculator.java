import java.util.Scanner;

public class InputCalculator{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = scr.nextInt();

        System.out.println("Enter Second Number :");
        int b = scr.nextInt();

        int add = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int divide = a/b;
        int remainder = a%b;

        System.out.println("The Addition result is: "+add);
        System.out.println("The Subtraction result is: "+subtract);
        System.out.println("The multiplication result is: "+multiply);
        System.out.println("The division result is: "+divide);
        System.out.println("The remainder result is: "+remainder);
    }
}