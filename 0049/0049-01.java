class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> m = new HashMap<>();
        
        for (String s: strs) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String k = new String(t);
            
            if (m.containsKey(k) == false) {
                m.put(k, new ArrayList<String>());   
            }
            m.get(k).add(s);
        }
        
        return new ArrayList<>(m.values());
    }
}
