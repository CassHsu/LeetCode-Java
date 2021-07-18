class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        int half = (num >> 1);
        for (int i = 1; i <= half; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
