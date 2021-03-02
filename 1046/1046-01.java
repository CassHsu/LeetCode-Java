class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int stone : stones) {
            pq.add(stone);
        }
        
        while (pq.size() > 1) {
            int m1 = pq.poll();
            int m2 = pq.poll();
            pq.add(m1 - m2);
        }
        
        return pq.size() == 1 ? pq.poll() : 0;
    }
}
