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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        List<ListNode> res = new ArrayList<>();

        while (curr != null){
            res.add(curr);
            curr = curr.next;
        }
        int index = res.size()-n;
         if(index == 0){
            return head.next;
        }
        res.get(index-1).next = res.get(index).next;
        return head;
    }
}
