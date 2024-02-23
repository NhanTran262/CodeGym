public class Sorting {
    public static void bubbleSort(int[] number) {
        for (int i = 1; i < number.length; i++) {
            for (int j = 0; j < number.length - i; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            int currentMin = number[i];
            int currenMinIndex = i;
            for (int j = i + 1; j < number.length; j++) {
                if (currentMin > number[j]) {
                    currentMin = number[j];
                    currenMinIndex = j;
                }

            }
            if (currenMinIndex != i) {
                number[currenMinIndex] = number[i];
                number[i] = currentMin;
            }
        }
    }

    public static void insertionSort(int[] number) {
        for (int i = 0; i < number.length; i++) {
            int currentElement = number[i];
            int j;
            for (j = i - 1; j >= 0 && number[j] > currentElement; j--) {
                number[j + 1] = number[j];
            }
            number[j + 1] = currentElement;
        }
    }
}
