public class bai15_dowhile {
    public static void main(String[] args) {
        //Tính tổng các số ừ 1 -5
        int a = 6;
        int tong = 0;
        do {
            tong+=a; //tong = tong +a
            a++;
        } while (a<=5);
        System.out.println("tong= "+tong);
    }
}
