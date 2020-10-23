public class ArrayDemo {
    public static void main(String[] args) {
        int MAX_LENGTH = 10;
        int[] arr;
        arr = new int[MAX_LENGTH];

        for(int i=0; i<MAX_LENGTH; i++){
            arr[i] = fib(i);
        }

        for(int i=0; i<MAX_LENGTH; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int fib(int n){
        if(n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}
