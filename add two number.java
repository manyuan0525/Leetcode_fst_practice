/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    // problem: add up two listnode numbers to one listnode
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // build a new listnode as result
        ListNode head = new ListNode(0);
        ListNode current = head;

        int addmore = 0, current_x = 0, current_y = 0;

        // keep looping until add up all the numbers in the listnode
        while (L1 != null || L2 != null || addmore != 0){
           // set value for current_x
           if (L1 != null)
               current_x = L1.val;
           else
               current_x = 0;
           // set value for current_y
           if (L2 != null)
               current_y = L2.val;
           else 
               current_y = 0;

           // get the (single column) current sum of x ,y and addmore number
           int sum1 = current_x + current_y + addmore;
           addmore = sum1 / 10;
           sum1 = sum1 % 10;
           current.next = new ListNode (sum1);

           // go to the next node of each listnode, if they are not empty
           if (L1 != null)
              L1 = L1.next;
           if (L2 != null)
              L2 = L2.next;  
           current = current.next;
        }
        return head.next;
    }
}