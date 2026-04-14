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
    public ListNode reverseKGroup(ListNode head, int k) {
        // 1. Base case: if head is null, return null
        if (head == null) return null;
        
        // 2. Check if we have at least k nodes left
        ListNode temp = head;
        int count = 1;
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }
        
        // If we don't have k nodes, return the head as is (do not reverse)
        if (temp == null) {
            return head;
        }
        
        // 3. Isolate the k-group
        ListNode nextGroupHead = temp.next;
        temp.next = null;               // Break the link
        
        // 4. Reverse the isolated k-group
        ListNode reversedHead = reverseList(head); 
        
        // 5. Recursion: Connect the old head (now the tail) to the next reversed group
        head.next = reverseKGroup(nextGroupHead, k);
        
        // 6. Return the new head of this reversed k-group
        return reversedHead; 
    }
    
    // Helper function to reverse a standard linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        return prev;
    }
}