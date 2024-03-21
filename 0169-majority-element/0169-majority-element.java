class Solution {
    public int majorityElement(int[] nums) {
        insertion(nums);

        int maxVal=nums[0], currVal=nums[0], count = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == currVal) {
                ++count;
            }
            else {
                if(count > Math.floor(nums.length/2)) {
                    maxVal = currVal;
                }
                currVal = nums[i];
                count = 1; 
            }
        }

        if(count > Math.floor(nums.length/2)) {
            maxVal = currVal;
        }
        return maxVal;
    }

    static void insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int p, int q) {
        int val = arr[p];
        arr[p] = arr[q];
        arr[q] = val; 
    }
}