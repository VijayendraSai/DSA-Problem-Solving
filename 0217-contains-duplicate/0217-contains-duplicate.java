class Solution {
    public boolean containsDuplicate(int[] nums) {
        return insertion(nums);
    }

    static boolean insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j, j-1);
                }
                else if(arr[j-1] == arr[j]) {
                    return true;
                }
                else {
                    break;
                }
            }
        }
        return false;
    }

    static void swap(int[] arr, int p, int q) {
        int val = arr[p];
        arr[p] = arr[q];
        arr[q] = val; 
    }
}