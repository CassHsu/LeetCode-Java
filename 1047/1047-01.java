class Solution {
    public String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.size() > 0 && arr[i].equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        Object[] str = stack.toArray();
        String res = "";
        for (Object c : str) {
            res += (String) c;
        }
        
        return res;
    }
}
