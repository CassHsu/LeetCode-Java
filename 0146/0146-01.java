class LRUCache {
    private HashMap<Integer, Integer> map = new HashMap<>();
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 0;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (this.map.containsKey(key) == false) return -1;
        this.queue.remove(key);
        this.queue.add(key);
        return this.map.get(key);
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key) == false) {
            if (this.map.size() == this.capacity) {
                this.map.remove(this.queue.remove());
            }
        } else {
            this.queue.remove(key);
        }
        
        this.map.put(key, value);
        this.queue.add(key);
    }
}
