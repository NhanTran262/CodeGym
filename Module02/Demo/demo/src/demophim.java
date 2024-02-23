import java.util.Scanner;

public class demophim {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            String acction = sc.nextLine();
            switch (acction){
                case "A":
                    System.out.println("Đi trái");
                    break;
                case "D":
                    System.out.println("Đi phải");
                    break;
                case "W":
                    System.out.println("Đi lên");
                    break;
                case "S":
                    System.out.println("Đi lùi");
                    break;
                case "SPACE":
                    System.out.println("Tấn công");
                    break;
                case "ALT":
                    System.out.println("Nhảy");
                    break;
                default:
                    System.out.println("Out");

            }
        }
    }
}
