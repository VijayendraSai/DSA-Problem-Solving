class Solution {
    public int[] buildArray(int[] nums) {
        int q = nums.length, b=0, r=0;

        // turn the array into a=qb+r
        for(int i=0; i<nums.length; i++) {
            r = nums[i];
            
            /* retrieve correct value from potentially already processed element
	            i.e. get r from something maybe already in the form a = qb + r
	            if it isnt already processed (doesnt have qb yet), that's ok b/c
	            r < q, so r % q will return the same value */
            b = nums[nums[i]] % q;

            // put it all together
            nums[i] = q*b + r;
        }
        // extract just the final b values
        for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i] / q;
        }
        return nums;
    }
}