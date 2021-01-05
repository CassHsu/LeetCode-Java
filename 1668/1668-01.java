class Solution {
    public int maxRepeating(String sequence, String word) {
        String repeat = word;
        int count = 0;
        
        while (sequence.contains(repeat)) {
            count++;
            repeat += word;
        }
        
        return count;
    }
}