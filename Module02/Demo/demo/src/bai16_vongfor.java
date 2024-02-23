public class bai16_vongfor {
    public static void main(String[] args) {
        /*for (int i=12; i>=0; i-=2) {
            System.out.println("i= "+i);
        }*/

        //Tính tổng các số chẵn ừ 0-10
        int tong = 0;
        for (int i=0; i<=10; i++) {
            tong+=i;
        }
        System.out.println("tổng= "+tong);
    }
}
