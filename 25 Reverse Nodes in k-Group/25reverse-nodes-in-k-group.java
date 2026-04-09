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
    ListNode ans=null,end=null;


    public void reverse(ListNode[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){ //reverse the array
            ListNode temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        for(int i=0;i<n-1;i++){
            arr[i].next=arr[i+1];
        }
        
        if(ans==null){
            ans=arr[0];
            end=arr[n-1];
        }
        else{
            end.next=arr[0];
            end=arr[n-1];
        }
        
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)return head;
        ListNode[] arr=new ListNode[k];
        int i=0;

        ListNode temp;
        while(head!=null){
            arr[i++]=head;
            if(i==k){
                temp=head.next;
                reverse(arr);
                i=0;
                head=temp;continue;
            }
            head=head.next;
        }

        if(i>0 && arr[0]!=null){
            if(end!=null){
                end.next=arr[0];
            }
            else{
                ans=arr[0];
            }
            for(int j=0;j<i-1;j++){
                arr[j].next=arr[j+1];
            }
            arr[i-1].next=null;
        }
        else if(end!=null){
            end.next=null;
        }
        return ans;      
    }
}