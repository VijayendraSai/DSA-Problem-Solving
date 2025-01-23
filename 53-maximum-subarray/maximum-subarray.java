class Solution {
    public int maxSubArray(int[] nums) {
        return findMaxSubarray(nums, 0, nums.length - 1);
    }

    private int findMaxSubarray(int[] nums, int left, int right) {
        // Base case: only one element
        if (left == right) {
            return nums[left];
        }

        // Find the midpoint
        int mid = left + (right - left) / 2;

        // Recursively find the max subarray in the left and right halves
        int leftMax = findMaxSubarray(nums, left, mid);
        int rightMax = findMaxSubarray(nums, mid + 1, right);

        // Find the max subarray that crosses the midpoint
        int crossMax = findCrossMax(nums, left, mid, right);

        // Return the maximum of the three
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    private int findCrossMax(int[] nums, int left, int mid, int right) {
        // Find max sum in the left half, ending at mid
        int leftSum = Integer.MIN_VALUE, sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        // Find max sum in the right half, starting at mid+1
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        // Combine the two
        return leftSum + rightSum;
    }
}
