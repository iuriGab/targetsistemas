public class PertenceFibonacci {

    public static boolean pertenceFibonacci(int number) {
        int a = 0;
        int b = 1;
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == number;
    }
}
