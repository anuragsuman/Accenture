package DataStructures.Lists;

public class ReverseLinkedList {


    public Node reverseList(Node head){
        Node previous = null;
        Node next = null;
        Node current = head;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);


        ReverseLinkedList rLL = new ReverseLinkedList();
        head = rLL.reverseList(head);

        while(head != null){
            System.out.println(head.value + " ");
            head = head.next;
        }
    }
}
