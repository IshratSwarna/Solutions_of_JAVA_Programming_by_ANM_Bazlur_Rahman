import java.util.Scanner;

public class IncomeTaxCalculator {
    public double calculateTax(double income){
        double tax = 0.0;
        if(income <= 250000.0){
            return tax;
        }
        income -= 250000.0;
        if(income >= 400000.0){
            tax += 40000.0;
            income -= 400000.0;
        }
        if(income >= 500000.0){
            tax += ((500000.0*15)/100);
            income -= 500000.0;
        }
        if(income >= 600000.0){
            tax += ((600000.0*20)/100);
            income -= 600000.0;
        }
        if(income >= 3000000.0){
            tax += ((3000000.0*25)/100);
            income -= 3000000.0;
        }
        if(income > 0){
            tax += ((income*30)/100);
        }
        return tax;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter your income : ");
        double income = scr.nextDouble();

        IncomeTaxCalculator calculator = new IncomeTaxCalculator();

        double tax = calculator.calculateTax(income);
        System.out.println("The amount of yor tax is: "+tax);
    }
}
