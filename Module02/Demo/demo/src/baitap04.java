import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng của 2 số: ");
        double tong = new Scanner(System.in).nextDouble();
        System.out.println("Nhập hiệu của 2 số: ");
        double hieu = new Scanner(System.in).nextDouble();
        double y = (tong-hieu)/2;
        double x = (tong+hieu)/2;

        System.out.println("Gía trị của x= "+x);
        System.out.println("Gía trị của y= "+y);


    }
}
