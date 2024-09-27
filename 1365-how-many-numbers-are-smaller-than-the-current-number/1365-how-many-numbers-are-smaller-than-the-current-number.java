class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[501];
        for(int num : nums) {
            temp[num]++;
        }

        int count = 0, t = 0;
        for(int i=0; i<temp.length; i++) {
            if(temp[i] != 0) {
                t = temp[i];
                temp[i] = count;
                count += t;
            }
        }

        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            result[i] = temp[nums[i]];
        }

        return result;
    }
}