class Solution {
    public boolean checkIfPangram(String sentence) {
        int size = sentence.length();
        if (size < 26) return false;
        
        int[] check = new int[26];
        for (int i = 0; i < size; i++) {
            check[sentence.charAt(i) - 'a']++;
        }
        
        for (int v: check) {
            if (v == 0) return false;
        }
        
        return true;
    }
}
