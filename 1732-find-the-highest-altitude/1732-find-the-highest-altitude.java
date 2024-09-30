class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0, currAlt = 0;
        for(int g : gain) {
            currAlt += g;
            maxAlt = Math.max(maxAlt, currAlt);
        }
        return maxAlt;
    }
}