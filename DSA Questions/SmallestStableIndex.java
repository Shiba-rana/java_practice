public class SmallestStableIndex {
    public static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] rightMin = new int[n];
        rightMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i]);
        }

        int leftMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, nums[i]);
            int instability = leftMax - rightMin[i];
            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 0, 1, 4};
        int k1 = 3;
        System.out.println("Output: " + firstStableIndex(nums1, k1));

        int[] nums2 = {3, 2, 1};
        int k2 = 1;
        System.out.println("Output: " + firstStableIndex(nums2, k2));

        int[] nums3 = {0};
        int k3 = 0;
        System.out.println("Output: " + firstStableIndex(nums3, k3));
    }
}
