class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Get the substring from the last space to the end
        String lastWord = s.substring(lastSpaceIndex + 1);

        return lastWord.length();
    }
}