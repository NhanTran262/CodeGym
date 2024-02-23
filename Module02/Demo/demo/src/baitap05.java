import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao(m): ");
        double chieucao = new Scanner(System.in).nextDouble();
        System.out.println("Nhập cân nặng(kg): ");
        double cannang = new Scanner(System.in).nextDouble();
        double BMI = cannang/Math.pow(chieucao,2);
        System.out.println("BMI của bạn là: "+BMI);

        if (BMI<15) {
            System.out.println("Thân hình quá gầy");
        } else if (BMI>=15 && BMI<16) {
            System.out.println("Thân hình gầy");
        } else if (BMI>=16 && BMI<18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (BMI>=18.5 && BMI<25) {
            System.out.println("Thân hình bình thường");
        } else if (BMI>=25 && BMI<30) {
            System.out.println("Thân hình hơi béo");
        } else if (BMI>=30 && BMI<35) {
            System.out.println("Thân hình béo");
        } else {
            System.out.println("Thân hình quá béo");
        }
    }
}
