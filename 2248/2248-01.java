class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        
        int[] count  = new int[1001];
        
        for(int[] n : nums){
            for(int i : n){
                count[i]++;
            }
        }
        
       for(int i = 0; i < count.length; i++){
           if(count[i] == nums.length) {
               res.add(i);
           }
       }
        
        return res;
    }
}
