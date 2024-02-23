import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Mời nhập chiều rộng b: ");
        double b = new Scanner(System.in).nextDouble();
        double s = a*b;
        double p = (a+b)*2;

        System.out.println("Diện tích s= "+s);
        System.out.println("Chu vi p= "+p);
    }
}
