class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] texts = text.split(" ");
        int ans = texts.length;
        
        if ("".equals(brokenLetters)) return ans;
        
        String[] brokens = brokenLetters.split("");
        
        for (String t: texts) {
            for (String b: brokens) {
                if (t.contains(b)) {
                    ans--;
                    break;
                }
            }
        }
        
        return ans;
    }
}
