class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length, n = accounts[0].length;
        int sum, wealth = 0;
        for(int i=0; i<m; i++) {
            sum = 0;
            for(int j=0; j<n; j++) {
                sum += accounts[i][j];
            }
            wealth = sum > wealth ? sum : wealth;
        }
        return wealth;
    }
}