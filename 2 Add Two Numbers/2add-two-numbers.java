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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {   
        int val=0;
        ListNode k=null;
        ListNode copy=null;
        int carry=0;
        ListNode n1=l1;ListNode n2=l2;


        while(n1!=null && n2!=null) 
        {
            val=n1.val+n2.val+carry;
            if(val>=10)
            {
                val=val%10;carry=1;
            }
            else 
            {
                carry=0;
            }
            ListNode new_node=new ListNode(val);
            if(k==null)
            {
                k=new_node;
                copy=k;
            }
            else
            {
                k.next=new_node;
                k=new_node;
            }
            n1=n1.next;n2=n2.next;
        }

        while(n1!=null)
        {
            val=n1.val+carry;
            if(val>=10)
            {
                val=val%10;carry=1;
            }
            else 
            {
                carry=0;
            }
            ListNode new_node=new ListNode(val);
            k.next=new_node;
            k=new_node;n1=n1.next;        
        }

        while(n2!=null)
        {
            val=n2.val+carry;
            if(val>=10)
            {
                val=val%10;carry=1;
            }
            else 
            {
                carry=0;
            }
            ListNode new_node=new ListNode(val);
            k.next=new_node;
            k=new_node;n2=n2.next;        
        }
        if(carry==1)k.next=new ListNode(1);


        return copy;
    }
}