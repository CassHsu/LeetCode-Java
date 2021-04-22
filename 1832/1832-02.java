class Solution {
    public boolean checkIfPangram(String sentence) {
        int size = sentence.length();
        if (size < 26) return false;
        
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(sentence.charAt(i));
        }
        
        return set.size() == 26;
    }
}
