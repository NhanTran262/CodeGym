import HinhHoc.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Width: ");
        double width = sc.nextDouble();
        System.out.println("Height: ");
        double height = sc.nextDouble();
        Rectangle rec = new Rectangle(width, height);
       // System.out.println(rec.display());
        System.out.println("Area of the Rectangle: "+rec.getArea());
        System.out.println("Perimeter of the Rectangle: "+rec.getPerimeter());


    }
}