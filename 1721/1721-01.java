class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        
        int il = k - 1;
        int ir = values.size() - k;
        curr = head;
        int i = 0;
        while (curr != null) {
            if (i == il) curr.val = values.get(ir);
            if (i == ir) curr.val = values.get(il);
            i++;
            curr = curr.next;
        }
        return head;
    }
}
