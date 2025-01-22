class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String prefix = findCommonPrefix(strs[0], strs[1]);
        if(prefix.equals("")) return "";

        for(int i=2; i<strs.length; i++) {
            prefix = findCommonPrefix(prefix, strs[i]);
            if(prefix.equals("")) return "";
        }
        return prefix;

    }
    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        String prefix = new String("");

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return prefix;
            }
            else {
                prefix = prefix + "" + str1.charAt(i);
            }
        }
        return prefix;
    }
}