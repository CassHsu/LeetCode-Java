class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> c = new HashMap<>();
        
        for (String a: arr) {
            if (c.get(a) != null) {
                c.put(a, c.get(a) + 1);
            } else {
                c.put(a, 1);
            }
        }
        
        for (String a: arr) {
            if (c.get(a) == 1) {
                k--;
                if (k == 0) return a;
            }  
        }
        
        return "";
    }
}
