import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.00;
        double height = 0.00;
        double area = 0.00;
        double perim = 0.00;
        double diag = 0.00;
            do {
                System.out.println("Enter the width: ");
                width = in.nextDouble();
            }while(width <= 0);
            do {
                System.out.println("Enter the height: ");
                height = in.nextDouble();
            }while(height <= 0);
        area = height * width;
        System.out.println("The area of the rectangle is : " + area);
        perim = (height * 2) + (width * 2);
        System.out.println("The perimeter of the rectangle is : " + perim);
        diag = (height * height) + (width * width);
        System.out.println("The length of the diagonal of the rectangle is : " + Math.sqrt(diag));
    }
}