
package arraysAndHashing.java;

/* 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *  Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 * 
 * Example 3:
 * Input: head = []
 * Output: []
 * 
*/

class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        //save current head temporary
        ListNode current = head;
        // pointer to the node that is reversed
        ListNode previous = null;
        //pointer tp the next node that is yet to be reversed and holding the entire node preventing it from being gabage collected
        ListNode next = null;

        // we terminate the process when we reach the last of the node
        while (current != null) {
            // assigning the next to pint the next node ftom the current node before breaking the node pointer of the curren
            next = current.next;
            // reversing the pointer to point the prevoius node 
            current.next = previous;
            // moving previous pointer to the next node
            previous = current;
            // moving current pointer to the next node
            current = next;
        }

        // returning reversed listnode
        return previous;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}