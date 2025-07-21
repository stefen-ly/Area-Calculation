import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        float base =0;
        float length = 0;
        float height = 0;
        float width = 0;
        float areaTriangle = 0;
        float areaRectangle = 0;
        int resultPower = 0;
        int a = 0 , b = 0;

//        System.out.println("-------[Calculate the area of a triangle]--------");
//        System.out.print("Enter the base of the triangle: ");
//        base = input.nextFloat();
//        System.out.print("Enter the height of the triangle: ");
//        height = input.nextFloat();
//        areaTriangle = (base * height) / 2;
//
//        System.out.println("The area of the triangle is: " + df.format(areaTriangle) + " square units");
//
//        System.out.println("-------[Calculate the area of a rectangle]-------");
//        System.out.print("Enter the length of the rectangle: ");
//        length = input.nextFloat();
//        System.out.print("Enter the width of the rectangle: ");
//        width = input.nextFloat();
//
//        areaRectangle = length * width;
//        System.out.println("The area of the rectangle is: " + df.format(areaRectangle) + " square units");

        System.out.println("-------[Calculate (a + b)^2 + (a - b)^2]--------");
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the value of b: ");
        b = input.nextInt();

        //resultPower = (int) (Math.pow((a + b), 2) + Math.pow((a - b), 2));
        resultPower = 2 * (a * a + b * b);
        System.out.println("The result of (a + b)^2 + (a + b)^2 is: " + resultPower);

    }
}