import java.util.Arrays;

public class sortJava {
    public static void main(String[] args) {
        int[] arr = {50,20,10,40,30};

        Arrays.sort(arr);
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        int[] brr = {13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(brr,1,5);
        for(int i=0; i<8; i++){
            System.out.print(brr[i] + " ");
        }
        System.out.println();
        Arrays.sort(brr,1,6); // 0=start index , 5 = end index+1 if it's 0 indexed array.
        for(int i=0; i<8; i++){
            System.out.print(brr[i] + " ");
        }
    }    
}
