import java.util.Arrays;

public class MyExampleTask5 {

    public static void main(String[] args) {
        int[] randomOrder = getRandomArray(10);
        System.out.println("Random number before sort : " + Arrays.toString(randomOrder));

        insertionSort(randomOrder);
        System.out.println("Random number after sort  : " + Arrays.toString(randomOrder));

    }

    public static int[] getRandomArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int numberToInsert = array[i];

            int Index = i;
            while (Index > 0 && array[Index - 1] > numberToInsert) {
                array[Index] = array[Index - 1];
                Index--;
            }
            array[Index] = numberToInsert;
        }
    }


}
