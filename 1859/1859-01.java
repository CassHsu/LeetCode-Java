class Solution {
    public String sortSentence(String s) {
        String[] ss = s.split(" ");
        String[] ret = new String[ss.length];
        
        for (String w: ss) {
            int i = w.charAt(w.length() - 1) - '0';
            ret[i - 1] = w.substring(0, w.length() - 1);
        }
        
        return String.join(" ", ret);
    }
}
