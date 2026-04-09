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
class Solution 
{
    public ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> obj=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode k:lists)
        {
            if(k==null)continue;
            while(k!=null)
            {
                ListNode j=k.next;
                k.next=null;
                obj.add(k);
                k=j;
            }
        }

        ListNode ans=obj.poll();
        ListNode k=ans;
        while(!obj.isEmpty())
        {
            ans.next=obj.poll();
            ans=ans.next;
        }
        return k;
    }
}