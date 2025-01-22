class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            for(int i=0; i<n; i++)
                nums1[i] = nums2[i];
            return;
        }
        int ptr1 = m-1, ptr2 = n-1, fill = m+n-1;
        while(ptr1 >= 0 && ptr2 >= 0) {
            if(nums2[ptr2] >= nums1[ptr1]) {
                nums1[fill] = nums2[ptr2];
                ptr2--;
                fill--;
            }
            else {
                nums1[fill] = nums1[ptr1];
                ptr1--;
                fill--;
            }
        }
        while(ptr2 >= 0 && fill >= 0) {
            nums1[fill] = nums2[ptr2];
            ptr2--;
            fill--;
        }
    }
}