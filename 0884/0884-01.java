class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> cm = new HashMap<>();
        ArrayList<String> ret = new ArrayList<>();
        
        String[] sArr = (s1 + " " + s2).split(" ");
        
        for (String w: sArr) {
            Integer v = cm.get(w);
            if (v == null) cm.put(w, 1);
            else cm.put(w, v + 1);
        }
        
        cm.forEach((k, v) -> {
           if (v == 1) {
               ret.add(k);
           } 
        });
        
        return ret.toArray(String[]::new);
    }
}
