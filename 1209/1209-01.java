class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Integer> counts = new Stack<>();
        char[] arr = s.toCharArray();
        int j = 0;
        
        for (int i = 0; i < s.length(); i++, j++) {
            arr[j] = arr[i];
            if (j == 0 || arr[j] != arr[j - 1]) {
                counts.push(1);
            } else {
                int a = counts.pop() + 1;
                if (a == k) {
                    j = j - k;
                } else {
                    counts.push(a);
                }
            }
        }
        
        return new String(arr, 0, j);
    }
}
