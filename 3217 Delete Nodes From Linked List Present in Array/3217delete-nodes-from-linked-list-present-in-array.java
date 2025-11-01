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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)hs.add(i);

        ListNode dummy=new ListNode(-1);
        ListNode start=null;

        while(head!=null){
            if(!hs.contains(head.val)){
                if(dummy.val==-1){
                    dummy=head;
                    start=dummy;
                }
                else{
                    dummy.next=head;
                    dummy=dummy.next;
                }
            }
            head=head.next;
        }
        if (dummy != null) dummy.next = null;

        return start;
    }
}