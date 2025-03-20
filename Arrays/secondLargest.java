public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 19, 14, 44 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
