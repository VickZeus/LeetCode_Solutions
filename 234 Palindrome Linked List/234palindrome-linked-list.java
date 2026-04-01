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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        Stack<Integer> stk=new Stack<Integer>();

        while(curr!=null){
            stk.push(curr.val);
            curr=curr.next;
        }

        curr=head;
        while(curr!=null){
            if(stk.peek()!=curr.val)return false;
            stk.pop();
            curr=curr.next;
        }
        return true;
    }
}