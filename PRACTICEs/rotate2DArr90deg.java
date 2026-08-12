import java.util.Scanner;

public class rotate2DArr90deg {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // logic to rotate 2D array by 90 degree
        int[][] rotated = new int[m][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                rotated[j][n-1-i] = arr[i][j];
            }
        }

        // print matrix
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }


    }
}
