class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int bars = 0;
        
        for (char c: s.toCharArray()) {
            switch(c) {
                case '*':
                    if (bars % 2 == 0) count++;
                    break;
                case '|':
                    bars++;
                    break;
                default:
                    break;
            }
        }
        
        return count;
    }
}
