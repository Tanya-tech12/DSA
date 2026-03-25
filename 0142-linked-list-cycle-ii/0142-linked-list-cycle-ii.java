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
        // ListNode temp = head;
        // Set s = new Hashset<>();
        // while(temp!=null){
        //     if(s.contains(temp)){
        //         return temp;
        //     }
        //     s.add(temp);
        //     temp = temp.next;
        // }





        ListNode slow = head;
          ListNode fast = head;
          while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                
                ListNode temp = head;
                while(temp != slow){
                    temp= temp.next;
                    slow=slow.next;
                }
                return temp;
            }

          }
          return null;
        
    }
}