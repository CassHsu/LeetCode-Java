class MyHashMap {
    private int[] buckets;
    
    public MyHashMap() {
        this.buckets = new int[1000001];
        
        for (int i = 0; i < 1000001; i++) {
            this.buckets[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        this.buckets[key] = value;
    }
    
    public int get(int key) {
        return this.buckets[key];
    }
    
    public void remove(int key) {
        this.buckets[key] = -1;
    }
}
