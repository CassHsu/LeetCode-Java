class Solution {
    public List<Integer> partitionLabels(String S) {
        HashMap<Character, Integer> last = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int j = 0;
        int anchor = 0;
        
        for (int i = 0; i < S.length(); i++) {
            last.put(S.charAt(i), i);
        }
        
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j, last.get(S.charAt(i)));
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        
        return ans;
    }
}
