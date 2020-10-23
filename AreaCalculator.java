public class AreaCalculator {
    public static final double PI = 3.14159;

    public double getArea(double radius){
        return PI*radius*radius;
    }

    public double getArea(int length, int width){
        return length*width;
    }

    public double getArea(double base, int height){
        return 0.5*base*height;
    }

    public double getArea(double radius, double height){
        return 2*PI*radius*(radius+height);
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("The Area of a Circle is : "+calculator.getArea(5));
        System.out.println("The Area of a Rectangle is : "+calculator.getArea(5,5));
        System.out.println("The Area of a Triangle is : "+calculator.getArea(5.0,5));
        System.out.println("The Area of a Cilinder is : "+calculator.getArea(5.0,5.0));
    }
}
