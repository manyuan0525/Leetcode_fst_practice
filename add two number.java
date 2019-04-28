/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode a = l1;
        ListNode b = l2;
        ListNode current = head;
        int addmore = 0;
        int current_x = 0;
        int current_y = 0;
        while (a != null || b != null || addmore != 0){
           if (a != null)
               current_x = a.val;
           else
               current_x = 0;
              
           if (b != null)
               current_y = b.val;
           else 
               current_y = 0;
           int sum1 = current_x + current_y + addmore;
           addmore = sum1 / 10;
           sum1 = sum1 % 10;
           current.next = new ListNode (sum1);
           if (a != null)
              a = a.next;
           if (b != null)
              b = b.next;  
           current = current.next;
        }
        return head.next;
    }
}