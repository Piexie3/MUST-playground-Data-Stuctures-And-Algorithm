/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * 
 * Example 1 
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * 
 * Example 2
 * Input: head = [1,2], pos = 0
 * Output: true
 * 
 * Example 3
 * Input: head = [1], pos = -1
 * Output: false
 */

class DetectCycleInALinkedList{
    public static void main(String[] args) {
        DetectCycleInALinkedList detectCycleInALinkedList = new DetectCycleInALinkedList();


        System.out.println(detectCycleInALinkedList.detectCycle(detectCycleInALinkedList.createCycle()));
    }
    public boolean detectCycle(ListNode head) {
        ListNode first = head;
        ListNode slow = head;
        while(first != null && first.next != null){
            first = first.next.next;
           slow = slow.next;
            if(first == slow){
                return true;
            }
        }
        return false;
    }

    // this is a sample of a cycled/loop linked list
    public ListNode createCycle(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(5);
        ListNode forth = new ListNode(8);
        ListNode fifth = new ListNode(9);
        ListNode head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = third;
        return head;
    }
}