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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)return head;
        ListNode n1=null,n2=null,temp,start1=null,start2=null;

        while(head!=null){
            temp=head.next; //holds the next node
            head.next=null;
            if(head.val<x){
                if(n1==null){
                    n1=head;
                    start1=n1;
                }
                else{
                    n1.next=head;
                    n1=n1.next;
                }
            }
            else{
                if(n2==null){
                    n2=head;
                    start2=n2;
                }
                else{
                    n2.next=head;
                    n2=n2.next;
                }
            }
            head=temp;
        }
        
        if(n1==null)return start2;
        n1.next=start2;
        return start1;
    }
}