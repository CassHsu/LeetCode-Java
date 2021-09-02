class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        
        Arrays.sort(words, (a, b) -> (a.length() - b.length()));
        
        int size = words.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (words[j].indexOf(words[i]) != -1) {
                    ans.add(words[i]);
                    break;
                } 
            }
        }
        
        return ans;
    }
}
