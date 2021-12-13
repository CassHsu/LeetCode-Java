class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] arr = new int[128];
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
            if (arr[s.charAt(i)] % 2 == 0) {
                count--;
            } else {
                count++;
            }
        }
        
        return count <= 1;
    }
}
