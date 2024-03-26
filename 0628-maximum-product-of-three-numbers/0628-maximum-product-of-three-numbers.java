class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length == 3) return nums[0] * nums[1] * nums[2];
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i : nums){
            if (i > max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            } 
            
            else if (i > max2 && i <= max1) {
                max3 = max2;
                max2 = i;
            } 
            
            else if (i > max3 && i <= max2) {
                max3 = i;
            }

            if(i < min1) {
                min2 = min1;
                min1 = i;
            }
            else if(i < min2 && i >= min1) {
                min2 = i;
            }
        }

        int res1 = max1 * max2 * max3;
        int res2 = min1 * min2 * max1;

        return (res1 > res2) ? res1 : res2;
    }
}