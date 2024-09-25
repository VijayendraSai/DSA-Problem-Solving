class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        if(candies.length <=0)
            return list;
        int largest = 0;
        for(int j =0; j<candies.length; j++){
            if(largest < candies[j])
                largest = candies[j];
        }
        for(int i =0; i<candies.length; i++){
            if((candies[i] + extraCandies) >= largest)
                list.add(Boolean.TRUE);
            else list.add(Boolean.FALSE);
        }
        return list;
    }
}