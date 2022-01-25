class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count =0;
        HashMap<String, Integer> m = new HashMap<>();
        
        for(String w : words1){
            m.put(w, m.getOrDefault(w, 0) + 1);
        }

        for(String w : words2){
            if(m.containsKey(w)) {
	            if(m.get(w) < 2){
	                m.put(w, m.get(w) - 1);
	            }
            }
        }
        
        for(String w: words1){
            if(m.get(w) == 0) count++;
        }
        
        return count;
    }
}
