class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        insertion(nums1);
        insertion(nums2);
        Set<Integer> res = new HashSet<Integer>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else {
                i++;
            }
        }
        // Convert set to int array
        int[] result = new int[res.size()];
        int index = 0;
        for (int element : res) {
            result[index++] = element;
        }

        return result;
    }

    static void insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                } 
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}