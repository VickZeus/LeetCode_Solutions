class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int len=0;
        ListNode temp=head;

        if(head==null || head.next==null)return null;

        while(temp!=null){
            temp=temp.next;
            len++;
        }

        len=len/2;//Middle index
        temp=head;
        while(head.next!=null){
            len--;
            if(len==0){
                ListNode x=head.next;
                if(x.next==null){
                    head.next=null;
                }
                else{
                    head.next=x.next;
                    x.next=null;
                }
                break;
            }
            head=head.next;
        }
        return temp;
    }
}