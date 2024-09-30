class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        
        for(int i=0;i<indices.length;i++){
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }
        //get odd num rows and cols
        int r=0,c=0;
        for(int i=0;i<m;i++){
            if(row[i]) r++;
        }
        for(int i=0;i<n;i++){
            if(col[i]) c++;
        }
        // return m * sum(odd_rows) + n * sum(odd_cols) - 2 * sum(odd_rows) * sum(odd_cols);
        int oddValues = r*n + c*m -2*r*c;
        return oddValues;
    }
}