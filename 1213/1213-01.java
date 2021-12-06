class Solution {
    private ArrayList<Integer> ans;
    private HashMap<Integer, Integer> m;
    
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        this.ans = new ArrayList<>();
        this.m = new HashMap<>();
        
        countArr(arr1);
        countArr(arr2);
        countArr(arr3);
        
        this.m.forEach((k, v) -> {
            if (v == 3) this.ans.add(k);
        });
        
        return this.ans;
    }
    
    private void countArr(int[] arr) {
        for (int n: arr) {
            if (this.m.containsKey(n)) {
                this.m.put(n, this.m.get(n) + 1);
            } else {
                this.m.put(n, 1);
            }
        }
    }
}
