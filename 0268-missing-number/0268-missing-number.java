class Solution {
    public int missingNumber(int[] nums) {
        cyclic_sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    static void cyclic_sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i];
            if(correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}