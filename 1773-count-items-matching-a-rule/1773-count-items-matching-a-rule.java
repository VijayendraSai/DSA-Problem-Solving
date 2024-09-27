class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int count = 0;
        int ruleIndex;
        // Determine the index based on ruleKey
        switch (ruleKey) {
            case "type":
                ruleIndex = 0; // Index for type
                break;
            case "color":
                ruleIndex = 1; // Index for color
                break;
            case "name":
                ruleIndex = 2; // Index for name
                break;
            default:
                return 0; // Return 0 if ruleKey is invalid
        }

        for(List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}