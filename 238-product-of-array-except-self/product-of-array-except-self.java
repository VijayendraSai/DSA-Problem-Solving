class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count_zero = 0, product = 1;
        for(int num: nums) {
            if(num == 0) {
                count_zero++;
            }
            else {
                product *= num;
            }
        }
        if(count_zero > 1) return new int[nums.length];

        if (count_zero == 1) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = (nums[i] == 0) ? product : 0;
            }
            return result;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = product / nums[i];
        }
        
        return result;
    }
}