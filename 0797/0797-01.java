class Solution {
    private List<List<Integer>> ans;
    private int[][] graph;
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        this.ans = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        path.add(0);
        
        backtrack(path, 0);
        return this.ans;
    }
    
    private void backtrack(ArrayList<Integer> path, int curr) {
        if (curr + 1 == this.graph.length) {
            this.ans.add(new ArrayList(path));
            return;
        }
        
        for (Integer n: this.graph[curr]) {
            path.add(n);
            backtrack(path, n);
            path.remove(path.size() - 1);
        }
    }
}
