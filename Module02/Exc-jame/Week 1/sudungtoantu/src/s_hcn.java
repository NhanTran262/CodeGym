import java.util.Scanner;

public class s_hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        double chieucao = sc.nextDouble();
        System.out.println("Nhập chiều rông: ");
        double chieurong = sc.nextDouble();
        double S = chieucao * chieurong;
        System.out.println("S= "+S);
    }
}
