public class Main {
    interface BaseI { void method(); }
    class BaseC
    {
        public void method()
        {
            System.out.println("Inside BaseC::method");
        }
    }
    class ImplC extends BaseC implements BaseI
    {
        public static void main(String []s)
        {
            (new ImplC()).method();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}