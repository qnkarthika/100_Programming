Palindrome Linked List
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true
  
Example 2:
Input: head = [1,2]
Output: false

Solution:


class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=head;
        slow=reversed(slow);

        while(slow!=null){
            if(slow.val!=fast.val) return false;
           slow=slow.next;
           fast=fast.next;
        }
        return true;
    }
    public ListNode reversed(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        ListNode next_=null;
        while(temp!=null){
            next_=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next_;
        }
        return prev;
    }
}
