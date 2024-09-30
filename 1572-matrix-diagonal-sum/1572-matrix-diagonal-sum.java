class Solution {
    public int diagonalSum(int[][] mat) {
        int l = -1, r = mat.length;
        int sum = 0;

        for(int i=0; i<mat.length; i++) {
            l += 1;
            r -= 1;

            if(l == r) {
                sum += mat[l][l];
            }
            else {
                sum += mat[l][i];
                sum += mat[i][r];
            }
        }

        return sum;
    }
}