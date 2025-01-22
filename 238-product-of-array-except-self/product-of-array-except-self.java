class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m = nums.length ; 
        int [] prefix = new int [m];
        int [] suffix = new int [m];
        prefix[0] = 1; 
        suffix[m-1] = 1 ; 

        for(int i =  1 ; i < m ; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i = m-2 ; i >= 0 ; i--){
            suffix[i] = suffix[i + 1 ] * nums[i + 1 ];
        }
        int [] ans = new int [m];

        for(int i = 0 ; i < m ; i++){
            ans[i] = prefix[i] * suffix[i];
        }

        return ans ; 
    }
}