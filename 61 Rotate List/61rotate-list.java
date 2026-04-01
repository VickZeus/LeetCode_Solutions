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

    public ListNode rotate(ListNode head){
        ListNode nHead=head,eNode;

        while(head.next.next!=null){
            head=head.next;
        }
        eNode=head.next;
        head.next=null;
        eNode.next=nHead;
        return eNode;
    }

    public int length(ListNode head){
        int i=0;
        while(head!=null){head=head.next;i++;}
        return i;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int l=length(head);
        k=k%l;
        for(int i=0;i<k;i++){
            head=rotate(head);    
        }
        return head;
    }
}