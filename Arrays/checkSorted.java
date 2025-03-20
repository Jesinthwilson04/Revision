public class checkSorted {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 4, 2, 4 };
        checkSort(arr);
        checkSort(arr2);
    }

    static void checkSort(int[] arr) {
        boolean sorted = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                sorted = true;
            } else {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("arrays is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }
}
