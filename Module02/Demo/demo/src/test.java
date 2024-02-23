public class test {
    public static void main(String[] args) {
        /*int i = 10.1;
        System.out.println("i = " + i);
        float f = 20.5f;
        System.out.println("f = " + f);
        double d = 20;
        System.out.println("d = " + d);
        boolean b = true;
        System.out.println("b = " + b);
        char c = 'a';
        System.out.println("c = " + c);
        String s = "Hà Nội";
        System.out.println("s = " + s);*/
        /*int a = -9;
        if (a<-8) {
            System.out.println("Hello");
        } else if ((a>-8) && (a<0)) {
            System.out.println("Hi");
        } else {
            System.out.println("C06");
        }*/

        //switch-case
        int thang = 13;
        switch (thang) {
            case 1:
            case 2:
            case 3:
                System.out.println("Mùa xuân");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Mùa hè");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Mùa thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Mùa đông");
                break;
            default:
                System.out.println("Out");
        }
    }
}
