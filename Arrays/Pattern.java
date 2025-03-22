import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fourXFourPattern(n);
        leftPyramid(n);
        leftPyramidNumber(n);
        downPyramid(n);
        downPyramidNums(n);

    }

    public static void fourXFourPattern(int n) {
        int[][] arr = new int[n][n];
        System.out.println("BUILDING");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void leftPyramid(int n) {
        int[][] arr = new int[n][n];
        System.out.println("LEFT PYRAMID");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void leftPyramidNumber(int n) {
        int[][] arr = new int[n][n];
        System.out.println("LEFT PYRAMID WITH NUMBER 'J'");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("LEFT PYRAMID WITH NUMBER 'I'");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void downPyramid(int n) {
        int[][] arr = new int[n][n];
        System.out.println("DOWN PYRAMID");
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    public static void downPyramidNums(int n) {
        int[][] arr = new int[n][n];
        System.out.println("DOWN PYRAMID");
        for (int i = 0; i < n; i++) {
            for (long j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
