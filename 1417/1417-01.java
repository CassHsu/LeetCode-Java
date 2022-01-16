class Solution {
    public String reformat(String s) {
        ArrayList<Character> alpha = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            Character c = s.charAt(i);
            if (Character.isDigit(c)) {
                digit.add(c);
            } else {
                alpha.add(c);
            }
        }
        
        
        if (alpha.size() - digit.size() > 1 || alpha.size() - digit.size() < -1) return "";
        
        boolean isAlphaFirst = (alpha.size() > digit.size()) ? true : false;
        
        String ans = "";
        int a = 0;
        int d = 0;
        
        while (alpha.size() > a && digit.size() > d) {
            if (isAlphaFirst) {
                ans += alpha.get(a).toString();
                ans += digit.get(d).toString();
            } else {
                ans += digit.get(d).toString();
                ans += alpha.get(a).toString();
            }
            
            a++;
            d++;
        }
        
        if (alpha.size() > a) ans += alpha.get(a).toString();
        if (digit.size() > d) ans += digit.get(d).toString();
        
        return ans;
    }
}
