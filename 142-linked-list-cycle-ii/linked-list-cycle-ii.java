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
// USING HASHSET
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashSet<ListNode> set = new HashSet<>();

//         ListNode temp = head;

//         while (temp != null) {
//             if (set.contains(temp)) {
//                 return temp; 
//             }
//             set.add(temp);
//             temp = temp.next;
//         }

//         return null; 
//     }
// }



//USING SLOW FAST
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        if(slow == fast){
            ListNode curr = head;
        while(curr!= slow){
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
        }
    }
    return null;
    }
}


