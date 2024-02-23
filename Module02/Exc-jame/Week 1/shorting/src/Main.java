import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = {9, 3, 7, 15, 11, 2, 8, 1, 16, 20};
//        System.out.println("Bubble Sort.");
        System.out.println("Selection Sort");
//        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(number)+" ");
//        Sorting.bubbleSort(number);
//        Sorting.selectionSort(number);
        Sorting.insertionSort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
}