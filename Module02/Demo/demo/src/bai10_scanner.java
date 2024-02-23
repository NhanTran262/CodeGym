import java.util.Scanner;

public class bai10_scanner {
    public static void main(String[] args) {
      /*  //Khởi tạo 1 đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        //Cho phép nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("mk cấp 1 là: "+mk1);
        //Nhập số nguyên
        System.out.println("Mời nập vào 1 số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("a= "+a);
        //Nhập số thực
        System.out.println("Mời nhập vào 1 số thực x: ");
        float x = sc.nextFloat();
        System.out.println("x= "+x);

        System.out.println("Mời nhập vào mk cấp 2: ");
        String mk2 = sc.nextLine();
        System.out.println("mk cấp 2 là: "+mk2);*/

        //Nhập chuỗi
        System.out.println("Mời nhập tên là: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Tên là: "+ten);

        System.out.println("Mời nhập giới tính là: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("giới tính là: "+gt);

        //Nhập số thực
        System.out.println("Mời nhập chiều cao: ");
        float cao = new Scanner(System.in).nextFloat();
        System.out.println("Chiều cao là: "+cao);

    }
}
