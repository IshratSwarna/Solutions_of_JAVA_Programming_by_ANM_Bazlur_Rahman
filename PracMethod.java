import java.util.Scanner;

public class PracMethod{
    public static void printText(String text){
        System.out.println(text);
    }

    public static int sum(int val1, int val2){
        return val1+val2;
    }

    public static int sub(int val1, int val2){
        return val1-val2;
    }

    public static String concat(String s1, String s2)
    throws IllegalArgumentException{
        if(s1 == ""){
            throw new IllegalArgumentException("First String is null.");
        }
        else if(s2 == ""){
            throw new IllegalArgumentException("Second string is null.");
        }
        else{
            return s1+s2;
        }  
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a single text :");
        String s = scr.nextLine();
        printText(s);

        System.out.println("Enter two numbers :");
        int a = scr.nextInt();
        int b = scr.nextInt();
        int addition = sum(a,b);
        int subtraction = sub(a,b);
        System.out.println("The Addition Result for the given numbers is : "+addition);
        System.out.println("The Subtraction Result for the given numbers is : "+subtraction);

        System.out.println("Enter two Strings for concatenation : ");
        String s1 = "";
        String s2 = "Dash";
        String s12 = concat(s1,s2);
        System.out.println("The Cancatened String is : "+s12);
    }
}