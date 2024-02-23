import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào dtb: ");
        double dtb = sc.nextDouble();
        //Kiểm tra điều kiện
        if (dtb>=8 && dtb<10) {
            System.out.println("Loại giỏi");
        }else if (dtb>= 7 && dtb<8){
            System.out.println("Loại khá");
        }else{
            System.out.println("Trung bình");
        }
    }
}
