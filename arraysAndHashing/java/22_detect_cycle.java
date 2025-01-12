import java.util.List;

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