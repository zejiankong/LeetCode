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
        while(fast!=null && fast.next!=null){ //fast.next!=null主要用于如果只有一个结点，需要返回Null.
            fast=fast.next.next;
            slow=slow.next;
            if(slow.equals(fast)){    //快慢指针相遇
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
