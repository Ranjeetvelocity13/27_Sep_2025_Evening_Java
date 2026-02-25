package Day_10_25_10_09_Method;

public class Method20 {

    public static void main(String[] args) {

    	Method20 obj = new Method20();

        double area1 = obj.calculateArea(10.5, 5.0);
        System.out.println("Area of Rectangle = " + area1);

        double area2 = obj.calculateArea(8.2, 4.3);
        System.out.println("Area of Rectangle = " + area2);
    }

    // Method with double parameters and double return type
    public double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}

