import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        // predefind
        // int [][]a = {
        //     {1,2,3},
        //     {4,5,6}
        // };

        // System.out.println(a[0][0]);
        // System.out.println(a[0][1]);
        // System.out.println(a[0][2]);
        
        // System.out.println(a[1][0]);
        // System.out.println(a[1][1]);
        // System.out.println(a[1][2]);

        // System.out.println("\n\t");

        
        // input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // print matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
