import java.util.Scanner;

public class baitap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 năm dương lịch: ");
        long nam = sc.nextLong();
        if (((nam %4==0) && (nam %100!=0)) || (nam %400==0)) {
            System.out.println(" Đây là năm nhuận: "+nam);
        } else {
            System.out.println("Đây không phải năm nhuận: "+nam);
        }
    }
}
