class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if((nums[i] & 1) == 0) {
                swap(nums, index, i);
                index++;
            }
        }
        return nums;
    }

    static void swap(int[] nums, int p, int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}