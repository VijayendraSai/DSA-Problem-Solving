class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int key=0;
    switch(ruleKey){
        case "type":{
            key=0;
            break;
        }
        case "color":{
            key=1;
            break;
        }
        case "name":{
            key=2;
            break;
        }
        default :{
            key=-1;
            break;
        }
    }
    return matchCall(items,0,key,0,ruleValue);
    }
    
    public int matchCall(List<List<String>>items,int i,int key,int count,String value){
        if(i==items.size()){
            return count;
        }
        if( items.get(i).get(key).equals(value)){
            count++;
        }
        return matchCall(items,i+1,key,count,value);
        }
}