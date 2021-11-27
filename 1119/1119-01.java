class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Boolean> vowels = new HashMap<>();
        vowels.put('a', true);
        vowels.put('e', true);
        vowels.put('i', true);
        vowels.put('o', true);
        vowels.put('u', true);
        
        for (int i = 0; i < s.length(); i++) {
            if (!vowels.containsKey(s.charAt(i))) sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}
