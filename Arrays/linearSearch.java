public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 9, 3, 4 };
        int find = 4;
        int findElement = findArr(arr, find);
        System.out.println(findElement >= 0 ? "The element found at index " + findElement : "Not Found");
    }

    static int findArr(int[] arr, int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }

        }
        return -1;

    }
}
