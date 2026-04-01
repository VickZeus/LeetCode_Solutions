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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode curr=head;
        ListNode ans=null,l1=null,l2=null,start=null;
        boolean val=true; //true->odd , false->eve

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=null;
            if(val){// Odd 
                if(l1==null){
                    l1=curr;
                    ans=l1;
                }
                else{
                    l1.next=curr;
                    l1=l1.next;
                }
            }
            if(!val){ //Eve
                if(l2==null){
                    l2=curr;
                    start=l2;
                }
                else{
                    l2.next=curr;
                    l2=l2.next;
                }  
            }
            val=!val;
            curr=temp;
        }
        l1.next=start;
        return ans;
    }
}