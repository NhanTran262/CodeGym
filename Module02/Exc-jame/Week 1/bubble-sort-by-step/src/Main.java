import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + "values");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        BubbleSortByStep.bubbleSortByStep(list);
    }
}