import java.util.*;

public class DistributeElements {

    public static int[] resultArray(int[] nums) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {

            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] res = new int[nums.length];
        int idx = 0;

        // Add arr1
        for (int x : arr1) {
            res[idx++] = x;
        }

        // Add arr2
        for (int x : arr2) {
            res[idx++] = x;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] res = resultArray(nums);

        System.out.println(Arrays.toString(res));
    }
}