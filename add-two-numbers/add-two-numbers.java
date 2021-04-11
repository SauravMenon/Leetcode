/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode res = new ListNode();
        ListNode cur = res;
        int next = 0;
        while (l1 != null || l2 != null) {
            cur.next = new ListNode();
            cur = cur.next;
            int tot = 0;
            if (l1 != null) {
                next += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                next += l2.val;
                l2 = l2.next;
            }
            cur.val = next % 10;
            next = next / 10;
        }
        if (next == 1) {
            cur.next = new ListNode();
            cur.next.val = 1;
        }
        return res.next;
    }
}