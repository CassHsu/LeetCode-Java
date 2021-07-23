class Solution {
    public int findCenter(int[][] edges) {
        int center = 1;
        int num = edges.length;
        
        for (int i = 1; i <= num + 1; i++) {
            int count = 0;
            
            for (int[] e: edges) {
                if (e[0] != i && e[1] != i) break;
                count++;
            }
            
            if (count == num) {
                center = i;
                break;
            }
        }
        
        return center;
    }
}
