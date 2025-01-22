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
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                result[i] = map.get(nums[i]);
            }
            else {
                result[i] = divideByNumber(product, nums[i]);
                map.put(nums[i], result[i]);
            } 
        }
        
        return result;
    }

    public static int divideByNumber(int dividend, int divisor) {
        int result = 0;
        int sign = 1;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if(divisor == 1) return dividend*sign;
        while (dividend > 0) {
            dividend -= Math.abs(divisor);
            result++;
        }
        result *= sign; 
        return result;
    }
}