import java.util.Scanner;

public class ngaythang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 tháng bất kỳ: ");
        int thang = sc.nextInt();

        switch (thang) {
            case 2:
                System.out.println(" Có 28 ngày hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            default:
                System.out.println("OUT");
                break;
        }
    }
}
