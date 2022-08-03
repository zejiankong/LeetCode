/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow.equals(fast)){
                 fast=head;
            while(!fast.equals(slow))
            { slow=slow.next;
              fast=fast.next;
            }
            return slow;
            }
        }
           return null;
    }
    }
