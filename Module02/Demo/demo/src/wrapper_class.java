public class wrapper_class {
    public static void main(String[] args) {
        int number = 42;
        Integer wrappedNumber = Integer.valueOf(number);
        int unwrappedNumber = wrappedNumber.intValue();
        System.out.println(unwrappedNumber);
    }
}
