import java.util.Scanner;

public class baitap09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 tháng bất kỳ: ");
        int thang = sc.nextInt();
        if ((thang==1) || (thang==2) || (thang==3)) {
            System.out.println("Qúy 1");
        } else if ((thang==4) || (thang==5) || (thang==6)) {
            System.out.println("Qúy 2");
        } else if ((thang==7) || (thang==8) || (thang==9)) {
            System.out.println("Qúy 3");
        } else if ((thang==10) || (thang==11) || (thang==12)) {
            System.out.println("Qúy 4");
        } else {
            System.out.println("Out");
        }

    }
}
