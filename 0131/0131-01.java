class Solution {
    private String s;
    private List<List<String>> ans = new ArrayList<List<String>>();
    
    public List<List<String>> partition(String s) {
        this.s = s;
        backtrack(new ArrayList<String>(), 0);
        
        return this.ans;
    }
    
    private void backtrack(List<String> curr, int start) {
        if (start >= this.s.length()) {
            this.ans.add(new ArrayList<String>(curr));
        }
        
        for (int i = start; i < this.s.length(); i++) {
            if (isPalindrome(start, i)) {
                curr.add(s.substring(start, i + 1));
                backtrack(curr, i + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(int low, int high) {
        while (low < high) {
            if (this.s.charAt(low++) != this.s.charAt(high--))
                return false;
        }
        return true;
    }
}
