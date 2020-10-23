import java.lang.Math;

public class Stat {
    public double mean(double[] x){
        int n = x.length;
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += x[i];
        }
        double mean = sum/n;
        return mean;
    }
    public double deviation(double[] x, double mean){
        int n = x.length;
        double sum = 0;
        double temp, temp2;
        for(int i=0; i<n; i++){
            temp = x[i] - mean;
            temp2 = Math.pow(temp, 2);
            sum += temp;
        }
        double deviation = Math.sqrt(sum/(n-1));
        return deviation;
    }

    public static void main(String[] args){
        double[] values = {18.88, 11.78, 11.07, 16.12, 12.44, 14.22, 11.78, 15.90, 19.14, 15.66};

        Stat stat = new Stat(); 
        double mean = stat.mean(values);
        double deviation = stat.deviation(values, mean);

        System.out.println("Mean : "+mean);
        System.out.println("Deviation : "+deviation);
    }
}
