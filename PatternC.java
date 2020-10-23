public class PatternC {
    public static void main(String[] args) {
        int mdSpace = 5;
        for(int row=1; row<=5; row++){
            if(row==1){
                for(int col=1; col<=5; col++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k=1; k<row; k++){
                    System.out.print(" ");
                }
                System.out.print("*");
                if(row<5){
                    for(int k=1; k<=mdSpace; k++){
                        System.out.print(" ");
                    }
                    mdSpace -= 2;
                    System.out.print("*");
                }    
            }
            System.out.print("\n");
        }
    }
}
