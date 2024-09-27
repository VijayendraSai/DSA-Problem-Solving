class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = 0, count = 0;
        switch(ruleKey){
            case "type":{
                ruleIndex = 0;
                break;
            }
            case "color":{
                ruleIndex = 1;
                break;
            }
            case "name":{
                ruleIndex = 2;
                break;
            }
            default :{
                ruleIndex = -1;
                break;
            }
        }

        for(List<String> item : items) {
            if(item.get(ruleIndex).equals(ruleValue))
                count++;
        }
        
        return count;
    }
}
