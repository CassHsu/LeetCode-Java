class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode n1 = null, n2 = null;
        ListNode curr = head;
        while (curr != null) {
            k--;
            if (n2 != null) {
                n2 = n2.next;
            }
            if (k == 0) {
                n1 = curr;
                n2 = head;
            }
            curr = curr.next;
        }
        
        int tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
        
        return head;
    }
}
