package DataStructures.Lists;

public class LinkedListCycle {
    // Method to detect loop in a list.
    public static void detectCycle(ListNode head) {

        if (head == null)
            return;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle found");
                break;
            }
        }

        if(slow != fast){
            System.out.println("No cycle found");
        }

        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode removedNode = fast.next;
        fast.next = null;

        System.out.println(removedNode.val);

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(50);
        head.next = new ListNode(20);
        head.next.next = new ListNode(15);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;

        detectCycle(head);

    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
