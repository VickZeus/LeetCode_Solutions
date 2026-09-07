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
    public ListNode swap(ListNode a, ListNode b){
        if(b==null)return a;

        ListNode temp=b.next;
        b.next=a;
        a.next=swap(temp,(temp==null)?null:temp.next);
        return b;
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        return swap(head,head.next);
    }
}