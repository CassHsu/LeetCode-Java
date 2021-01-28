class Solution {
    public String maximumTime(String time) {
        char[] res = time.toCharArray();
        char q = '?';
        
        if (res[0] == q) res[0] = (res[1] != q && res[1] > '3' ? '1' : '2');
        if (res[1] == q) res[1] = (res[0] > '1' ? '3' : '9');
        if (res[3] == q) res[3] = '5';
        if (res[4] == q) res[4] = '9';
        
        return new String(res);
    }
}