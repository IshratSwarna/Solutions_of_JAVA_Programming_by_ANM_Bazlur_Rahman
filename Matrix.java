import java.util.Random;

public class Matrix {
    Random random = new Random();

    //returns a random m*n matrix with values btn 0 & 1
    public int[][] random(int m, int n){
        int[][] tempMatrix = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                tempMatrix[i][j] = random.nextInt(100);
            }
        }
        return tempMatrix;
    }

    //return c = a*b;
    public int[][] multiply(int[][] a, int[][] b){
       int mA = a.length ;
       int nA = a[0].length;
       int mB = b.length;
       int nB = b[0].length;
       if(nA != mB){
           throw new RuntimeException("Illegal matrix dimensions.");
       }
       int[][] c = new int[mA][nB];
       for(int i=0; i<mA; i++){
           for(int j=0; j<nB; j++){
               for(int k=0; k<nA; k++){
                   c[i][j] += a[i][k] + b[k][j];
               }
           }
       }
       return c;
    }

    //return c = a+b;
    public int[][] add(int[][] a, int[][] b){
        int m = a.length;
        int n = a[0].length;
        int[][] c = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    //return c = a-b;
    public int[][] subtract(int[][] a, int[][] b){
        int m = a.length;
        int n = a[0].length;
        int[][] c = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                c[i][j] = a[i][j] - b[i][j];
            }       
        }
        return c;
    }

    //print c;
    public void print(int[][] c){
        int m = c.length;
        int n = c[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //print c by for-each loop
    public void printByForEach(int[][] c){
        for(int[] ec : c){
            for(int eec : ec){
                System.out.print(eec + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Matrix matrix = new Matrix();

        int[][] a = matrix.random(5,5);
        int[][] b = matrix.random(5,5);

        int[][] rMultiplication = matrix.multiply(a, b);
        System.out.println("Result Multiplication :");
        matrix.print(rMultiplication);
        System.out.println("--------------------------------");
        matrix.printByForEach(rMultiplication);

        int[][] rAddition = matrix.add(a, b);
        System.out.println("Result for Addition :");
        matrix.print(rAddition);
        System.out.println("--------------------------------");
        matrix.printByForEach(rAddition);

        int[][] rSubtraction = matrix.subtract(a, b);
        System.out.println("Result for Subtraction :");
        matrix.print(rSubtraction);
        System.out.println("--------------------------------");
        matrix.printByForEach(rSubtraction);
        
    }


    
}
