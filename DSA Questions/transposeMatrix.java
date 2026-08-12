import java.util.Scanner;

public class transposeMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input matrix size
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose matrix
        transpose(arr);


    }

    public static void transpose(int[][] arr) {

        // Swap elements across the diagonal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Print transposed matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}