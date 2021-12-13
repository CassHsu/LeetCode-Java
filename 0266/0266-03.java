class Solution {
    public boolean canPermutePalindrome(String s) {
        int count = 0;
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        
        for (int k = 0; k < arr.length && count <= 1; k++) {
            count += arr[k] % 2;
        }
        
        return count <= 1;
    }
}
