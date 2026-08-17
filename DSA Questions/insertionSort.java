import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];

            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]+ " ");
        // }

        System.out.println(Arrays.toString(arr));
    }
}
