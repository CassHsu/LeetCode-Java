class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) return true;
        if (word.equals(word.toLowerCase())) return true;
        if (word.charAt(0) == Character.toUpperCase(word.charAt(0))) {
            String w = word.substring(1);
            if (w.equals(w.toLowerCase())) return true;
        }

        return false;
    }
}
