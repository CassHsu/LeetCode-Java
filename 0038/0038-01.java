class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String cs = countAndSay(n - 1);
        String res = "";
        int count = 0;
        char init = cs.charAt(0);
        
        for (char c: cs.toCharArray()) {
            if (c == init) {
                count++;
            } else {
                res += String.valueOf(count) + String.valueOf(init);
                count = 1;
                init = c;
            }
        }
        
        res += String.valueOf(count) + String.valueOf(init);
        return res;
    }
}