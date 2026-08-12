import java.util.*;

public class maxSubarrayLengthFreq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {

            // Add nums[right]
            freq.put(nums[right],
                    freq.getOrDefault(nums[right], 0) + 1);

            // Shrink window if frequency > k
            while (freq.get(nums[right]) > k) {

                freq.put(nums[left],
                        freq.get(nums[left]) - 1);

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}