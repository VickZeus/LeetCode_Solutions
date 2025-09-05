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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        ListNode shead=null;
        ListNode start=null;
        boolean flag=true;

        while(curr!=null){
            flag=true;
            while(curr.next!=null && curr.val==curr.next.val){
                curr=curr.next;
                flag=false;
            }
            if(flag){
                if(start==null){
                    start=curr;
                    shead=start;
                }
                else{
                    start.next=curr;
                    start=start.next;
                }
            }
            curr=curr.next;
        }
        if(start!=null)start.next=null;
        return shead;
    }
}