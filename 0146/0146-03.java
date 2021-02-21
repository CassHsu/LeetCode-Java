class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        
        Node(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }
    
    private Map<Integer, Node> map = new HashMap<>();
    private Node head;
    private Node tail;
    private int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void add(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        
        remove(node);
        add(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) remove(map.get(key));
        if (map.size() == this.capacity) remove(tail.prev);
        add(new Node(key, value));
    }
}
