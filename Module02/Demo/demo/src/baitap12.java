import java.util.Scanner;

public interface baitap12 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập 1 số nguyên: ");
//        int n = sc.nextInt();
//        int giaithua = 1;
//        for (int i=1; i<=n; i++) {
//            giaithua = giaithua*i;
//            System.out.println("!n= "+giaithua);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên: ");
        int n = sc.nextInt();
        int giaithua = 1;
        int  i = 1;
        while (i<=n) {
            giaithua = giaithua *i;
            i++;
        }
        System.out.println("!n= "+giaithua);

    }
}
