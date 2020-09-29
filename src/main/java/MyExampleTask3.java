public class MyExampleTask3 {
    public static int fibanacciRec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibanacciRec(n - 2) + fibanacciRec(n - 1);
    }

    public static void main(String[] args) {
        int maxNum = 16;
        System.out.println("Fibonacci Series of " + maxNum + " numbers: ");
        for (int i = 0; i < maxNum; i++) {
            System.out.print(fibanacciRec(i) + " ");
        }
    }

}
