class MinStack {
    /** initialize your data structure here. */
    private Stack<Integer> valStack = null;
    private Stack<Integer> minStack = null;
    public MinStack() {
        this.valStack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        this.valStack.push(x);
        if (!this.minStack.empty() && x > this.minStack.peek()) {
            this.minStack.push(this.minStack.peek());
        } else {
            this.minStack.push(x);
        }
    }
    
    public void pop() {
        this.valStack.pop();
        this.minStack.pop();
    }
    
    public int top() {
        return this.valStack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
