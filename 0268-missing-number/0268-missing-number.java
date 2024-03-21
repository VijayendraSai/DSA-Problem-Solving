class Solution {
    public int missingNumber(int[] nums) {
        int sumOfArray = 0;
        int sumOfRange = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sumOfRange += i;
            sumOfArray += nums[i];
        }

        return sumOfRange - sumOfArray;
    }
}