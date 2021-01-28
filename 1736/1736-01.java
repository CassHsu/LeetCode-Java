class Solution {
    public String maximumTime(String time) {
        String[] res = time.split("");
        String q = "?";
        if (q.equals(res[0])) res[0] = (!q.equals(res[1]) && Integer.valueOf(res[1]) > 3? "1": "2");
        if (q.equals(res[1])) res[1] = (Integer.valueOf(res[0]) > 1 ? "3": "9");
        if (q.equals(res[3])) res[3] = "5";
        if (q.equals(res[4])) res[4] = "9";
        
        return String.join("", res);
    }
}