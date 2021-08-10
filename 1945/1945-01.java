class Solution {
    public int getLucky(String s, int k) {
        String ts = convert(s);
        
        while (k > 0) {
            ts = transform(ts);
            k--;
        }
        
        return Integer.valueOf(ts);
    }
    
    private String convert(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.append(String.valueOf((s.charAt(i) - 'a') + 1));
        }
        
        return sb.toString();
    }
    
    private String transform(String s) {
        Integer sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - '0');
        }
        
        return String.valueOf(sum);
    }
}
