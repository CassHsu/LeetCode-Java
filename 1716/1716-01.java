class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int w = n / 7;
        int r = n % 7;
        int monday = 1;
        
        for (int i = 0; i < w; i++) {
            int tmp = monday;
            for (int j = 0; j < 7; j++) {
                total += tmp;
                tmp++;
            }
            monday++;
        }
        
        int tmp = monday;
        for (int i = 0; i < r; i++) {
            total += tmp;
            tmp++;
        }
        
        return total;
    }
}