class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.isEmpty()) return false;

        int size = s.length();
        for (int i = 0; i < size; i++) {
            int subSize = i + 1;

            if (size % subSize != 0) continue;
            if (size == subSize) continue;

            String subStr = s.substring(0, subSize);

            boolean isFound = true;
            for (int j = 0; j < size; j += subSize) {
                String currStr = s.substring(j, j + subSize);
                if (currStr.equals(subStr) == false) {
                    isFound = false;
                    break;
                }
            }
            if (isFound) return true;
        }
        return false;
    }
}
