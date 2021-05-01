class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = (coordinates.charAt(0) - 'a' + 1) % 2;
        int y = (coordinates.charAt(1) - '0') % 2;
        
        return (x ^ y) == 1;
    }
}
