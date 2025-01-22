class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1, ptr = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[ptr] = nums[i];
                ptr++;
                k++;
            }
        }
        return k;
    }
}