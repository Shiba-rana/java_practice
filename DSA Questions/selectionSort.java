import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minVal = arr[i];
            int minIdx = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < minVal) {
                    minVal = arr[j];
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            for(int val: arr) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }
}
