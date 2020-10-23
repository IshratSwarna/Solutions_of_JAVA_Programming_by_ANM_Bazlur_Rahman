import java.util.Scanner;
public class countExistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter your element : ");
        int k = scanner.nextInt();
        int ans = calculateExistance(array,k);
        System.out.println("This Element is in this array for "+ans+" times.");

    }

    public static int calculateExistance(int[] array, int k){
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == k){
                count++;
            }
        }
        return count;
    }
}
