class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> letters = new Stack();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c)) letters.push(c);
        }
        
        StringBuilder ret = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c)) {
                ret.append(letters.pop());
            }
            else {
                ret.append(c);
            }
        }
        return ret.toString();
    }
}
