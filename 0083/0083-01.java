class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ite = head;
        while (ite != null) {
            ListNode tmp = ite.next;
            while (tmp != null && tmp.val == ite.val) {
                tmp = tmp.next;
            }
            
            ite.next = tmp;
            ite = ite.next;
        }
        return head;
    }
}
