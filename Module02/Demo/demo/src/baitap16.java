public class baitap16 {
    public static void main(String[] args) {
        int gt = 1;
        int sum =0;
        for (int i=1; i<=10; i++) {
            gt*= i;
            sum+=gt;
        }
        System.out.println("S= "+sum);
    }
}
