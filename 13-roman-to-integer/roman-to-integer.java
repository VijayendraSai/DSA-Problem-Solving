class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int n = s.length(), count = romanValues.get(s.charAt(n-1));

        for(int i=n-2; i>=0; i--) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1 == 'I' && (ch2 == 'V' || ch2 == 'X')) {
                count -= romanValues.get(ch1);
            }
            else if(ch1 == 'X' && (ch2 == 'L' || ch2 == 'C')) {
                count -= romanValues.get(ch1);
            }
            else if(ch1 == 'C' && (ch2 == 'D' || ch2 == 'M')) {
                count -= romanValues.get(ch1);
            }
            else {
                count += romanValues.get(ch1);
            }
        } 
        return count;      
    }
}