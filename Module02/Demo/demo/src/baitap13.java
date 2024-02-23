import java.util.Scanner;
import java.util.SortedMap;

public class baitap13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=a; i+=2) {
            if (a%2==0) {
                sum+=i;
                System.out.println("Tổng= "+sum);
            } else {
                System.out.println("Tôi không tính tổng số lẻ");
                break;
            }
        }
    }
}
