class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) 
            m.put(s.charAt(i), i);
            
        for (int i = 0; i < t.length(); i++) 
            ans += Math.abs(i - m.get(t.charAt(i)));

        return ans;
    }
}
