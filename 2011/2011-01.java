class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        
        for (String op: operations) {
            if ("--X".equals(op) || "X--".equals(op)) ans--;
            if ("++X".equals(op) || "X++".equals(op)) ans++;
        }
        
        return ans;
    }
}
