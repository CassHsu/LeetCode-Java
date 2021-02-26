class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size1 = s1.length();
        int size2 = s2.length();
        
        if (size1 > size2) return false;
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < size1; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        
        int w = size2 - size1; 
        for (int i = 0; i < w; i++) {
            if (matches(arr1, arr2)) return true;
            
            arr2[s2.charAt(i + size1) - 'a']++;
            arr2[s2.charAt(i) - 'a']--;
        }
        return matches(arr1, arr2);
    }
    
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;   
        }
        return true;
    }
}
