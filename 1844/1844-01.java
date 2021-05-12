class Solution {
    public String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i += 2) {
            charArray[i] += charArray[i-1] - '0';   
        }
        return new String(charArray);
    }
}
