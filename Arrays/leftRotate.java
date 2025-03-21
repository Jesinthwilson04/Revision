import java.util.Arrays;

class leftRotate {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = i + 1;
        int temp = 0;
        int iter = 0;
        while (iter < 3) {
            while (i < arr.length - 1 && j < arr.length) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
            System.out.println(Arrays.toString(arr));
            i = 0;
            j = i + 1;
            iter++;
        }

        System.out.println(Arrays.toString(arr));

    }
}