import java.util.Arrays;
import java.util.Collections;

class Largest {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 2, 4, 1 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.err.println(max);
    }
}
