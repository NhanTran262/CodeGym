import Toan.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double discriminant = equation.getDiscriminant();
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        System.out.println(equation.display());
//        System.out.println("The equation has no root");
        System.out.println("The equation has one root: "+root1);
        System.out.println("The equation has two roots: "+root2+ " and " +root2);

        }

    }
