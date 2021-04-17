class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();
        for (int i = size / 2; i >= 1; i--) {
            if (size % i == 0) {
                int repeat = size / i;
                String subStr = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    sb.append(subStr);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
