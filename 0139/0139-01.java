class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wSet = new HashSet<>(wordDict);
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[s.length()];
        
        q.add(0);
        while (!q.isEmpty()) {
            int start = q.remove();
            if (visited[start]) {
                continue;
            }
            
            for (int end = start + 1; end <= s.length(); end++) {
                if (wSet.contains(s.substring(start, end))) {
                    q.add(end);
                    if (end == s.length()) {
                        return true;
                    }
                }
            }
            visited[start] = true;
        }
        return false;
     }
}
