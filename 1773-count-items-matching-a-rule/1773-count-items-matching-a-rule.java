class Solution {
    int matchesOrNot(List<String> items, String ruleValue, int index) {
        if(items.get(index).equals(ruleValue)) {
            return 1;
        }
        return 0;
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int size = items.size();
        int index = 0;
        if(ruleKey.equals("type")) index = 0;
        else if(ruleKey.equals("color")) index = 1;
        else index = 2;

        for(int i = 0; i < size; i++) {
            count += matchesOrNot(items.get(i), ruleValue, index);
        }

        return count;
    }
}
