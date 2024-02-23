public class bai9_toantulogic {
    public static void main(String[] args) {
       /* int i = 7;
        //Kiểm tra gia trị i>0 và i<10 không
        System.out.println(i>0 && i<10);
        //Kiểm tra xem i>10 hoặc i< -1
        System.out.println(i>10 || i<-1);
        //Phép phủ định
        System.out.println(!(i>10 || i<-1));

        //Toán tử tiền tố hậu tố
        int x=100;
        int y=90;
        int z=80;
        int t=70;

        x++; //x=x+1 Tăng x lên 1 giá trị
        ++y; // Tăng y lên 1 giá trị
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);*/

        int a =1;
        int b =2;
        int c = a++ - ++b +1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
