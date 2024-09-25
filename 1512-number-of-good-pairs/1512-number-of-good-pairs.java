class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);

        int pairs = 0;
        for(int i = 0; i < nums.length;) {
            int j = i+1;
            while(j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            int n = j-i;
            pairs += n * (n-1)/2;

            i = j;
        }

        return pairs;
    }
}