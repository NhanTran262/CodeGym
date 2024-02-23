public class bai6_epkieudulieu {
    public static void main(String[] args) {
        //ép kiểu rộng ( ép từ kiểu sữ liệu bé sang lớn)
        int a = 5;
        int b = 10;
        double result = (double) a/b;
        System.out.println(result);

        //ép kiểu hẹp ( ép từ kiểu dữ liệu lớn sang bé)
        int c = 128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);

        int e = 15;
        byte f = (byte) e;
        System.out.println(e);
        System.out.println(f);
    }
}
