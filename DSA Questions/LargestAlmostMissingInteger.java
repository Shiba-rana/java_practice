import java.util.HashMap;
import java.util.Map;

public class LargestAlmostMissingInteger {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1: Count global frequencies of each number in the array
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        // Case 1: k equals the full length of the array
        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                if (num > maxVal) {
                    maxVal = num;
                }
            }
            return maxVal;
        }
        
        // Case 2: k is 1
        if (k == 1) {
            int maxUnique = -1;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() == 1 && entry.getKey() > maxUnique) {
                    maxUnique = entry.getKey();
                }
            }
            return maxUnique;
        }
        
        // Case 3: 1 < k < n
        int ans = -1;
        if (counts.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (counts.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        LargestAlmostMissingInteger solver = new LargestAlmostMissingInteger();

        int[] nums1 = {3, 9, 2, 1, 7};
        int k1 = 3;
        System.out.println("Test 1 Output: " + solver.largestInteger(nums1, k1)); // Expected: 7

        int[] nums2 = {3, 9, 2, 1, 7};
        int k2 = 1;
        System.out.println("Test 2 Output: " + solver.largestInteger(nums2, k2)); // Expected: 9
    }
}
