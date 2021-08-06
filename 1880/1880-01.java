class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstNum = Integer.valueOf(getNumStr(firstWord));
        int secondNum = Integer.valueOf(getNumStr(secondWord));
        int targetNum = Integer.valueOf(getNumStr(targetWord));
        
        return firstNum + secondNum == targetNum;
        
    }
    
    private String getNumStr(String word) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            sb.append(String.valueOf(word.charAt(i) - 'a'));
        }
        
        return sb.toString();
    }
}
