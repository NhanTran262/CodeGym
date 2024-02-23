import compare.CompareDepTrai;
import compare.CompareTien;
import entity.Human;

public class Main {
    public static void main(String[] args) {
        Human kiet = new Human(22, 6, 100, 10000000);
        Human thang = new Human(21, 10, 10, 1000000);

        CompareDepTrai compareDepTrai = new CompareDepTrai();
        CompareTien compareTien = new CompareTien();


//        int ketqua = kiet.compareTo(thang);
        int ketqua = compareDepTrai.compare(kiet, thang);
//        ketqua = compareTien.compare(kiet, thang);

        if (kiet.equals(thang)) {
            System.out.println("bang nhau");
        } else
            System.out.println("ko bang");

        System.out.println(thang.hashCode());
        System.out.println(kiet.hashCode());
    }
}