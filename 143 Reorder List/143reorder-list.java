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

 //Approach
 // 1) Find Midpoint
 // 2) Reverse second half
class Solution {
    
    public ListNode reverse(ListNode head){
        ListNode ans=null,temp,prev=null;

        while(head!=null){
            temp=head.next;

            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
       ListNode slow=head,fast=head;

       while(fast.next!=null && fast.next.next!=null){ //slow is the midnode
            slow=slow.next;
            fast=fast.next.next;
       } 

       ListNode n2=slow.next,n1=head,ans=null;
       slow.next=null;
       n2=reverse(n2); //reverse and get the head2 node
       
       boolean status=true;

        while(n1!=null && n2!=null){
            if(ans==null){
                ans=n1;
                n1=n1.next;
            }
            else{
                if(status){
                    ans.next=n1;
                    n1=n1.next;
                    ans=ans.next;
                }
                else{
                    ans.next=n2;n2=n2.next;
                    ans=ans.next;
                }
            }
            status=!status;
        }

        while(n1!=null){ans.next=n1;n1=n1.next;};
        while(n2!=null){ans.next=n2;n2=n2.next;};
        head=ans;
    }
}