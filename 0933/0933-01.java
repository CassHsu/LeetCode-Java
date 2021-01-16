import java.util.ArrayDeque;

class RecentCounter {
    private Deque<Integer> requests;
    public RecentCounter() {
        this.requests = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        this.requests.addLast(t);
        int l = t - 3000;
        while (this.requests.peekFirst() < l) {
            this.requests.removeFirst();
        }
        return this.requests.size();
    }
}