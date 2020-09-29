import java.util.Arrays;

public class MyExampleTask4 {

    public static void main(String[] args) {
        int[] randomOrder = getRandomArray(10);
        System.out.println("Random number before sort : " + Arrays.toString(randomOrder));

        selectSort(randomOrder);
        System.out.println("Random number after sort  : " + Arrays.toString(randomOrder));
    }

    public static int[] getRandomArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

    static void selectSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

}
