class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (Arrays.stream(strs).filter(s -> "".equals(s)).toArray(String[]::new).length > 0) return "";
        if (strs.length == 1) return strs[0];
                
        int minLen = Arrays.stream(strs).map(s -> s.length()).mapToInt(Integer::valueOf).min().getAsInt();
        int end = 0;
        while (end < minLen) {
            end++;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i-1].substring(0, end).equals(strs[i].substring(0, end)) == false) {
                    return strs[0].substring(0, end-1);
                }
            }
        }
        return strs[0].substring(0, end);
    }
}