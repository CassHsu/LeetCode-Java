class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<String>();
        String p = findPattern(pattern);
        
        for (String w : words) {
            if (p.equals(findPattern(w))) {
                res.add(w);
            }
        }
        
        return res;
    }
    
    private String findPattern(String pattern) {
        String code = "";
        int c = 0;
        HashMap<Character, Integer> pm = new HashMap();
        
        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            if (pm.get(p) == null) {
                pm.put(p, c);
                c++;
            }
            code += pm.get(p);
        }
        
        return code;
    }
}
