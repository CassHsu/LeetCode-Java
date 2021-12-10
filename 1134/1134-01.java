class Solution {
    public boolean isArmstrong(int n) {
        int total = 0;
        String sn = String.valueOf(n);
        int size = sn.length();
        String[] arr = sn.split("");
        
        for (String s: arr) {
            Integer si = new Integer(s);
            total += Math.pow(si, size);
        }
        
        return total == n;
    }
}
