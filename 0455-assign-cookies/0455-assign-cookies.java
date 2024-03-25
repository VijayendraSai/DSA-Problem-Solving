class Solution {
    public int findContentChildren(int[] g, int[] s) {
        quickSort(g, 0, g.length - 1);
        quickSort(s, 0, s.length - 1);

        int satisfy = 0;

        for(int i=0,j=0; i<g.length && j<s.length; j++) {
            if(s[j] >= g[i]) {
                ++satisfy;
                i++;
            }
        }

        return satisfy;
    }

    static void quickSort(int[] nums, int low, int high) {
        if(low >= high) return;

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];
        while(s <= e) {
            while(nums[s] < pivot) s++;

            while(nums[e] > pivot) e--;

            if(s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}