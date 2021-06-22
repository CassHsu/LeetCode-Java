class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op: ops) {
            if (op.equals("+")) {
                int last1 = stack.pop();
                int last2 = stack.pop();
                int newtop = last1 + last2;
                stack.push(last2);
                stack.push(last1);
                stack.push(newtop);
                
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        
        int ans = 0;
        for (int s: stack) {
            ans += s;
        }
        return ans;
    }
}
