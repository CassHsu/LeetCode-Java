class Solution {
    public int minimizedStringLength(String s) {
        String[] arr = s.split("");
        
        HashSet<String> set = new HashSet<String>();
        for (String c: arr) {
            set.add(c);
        }
        return set.size();
    }
}
