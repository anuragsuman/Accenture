package DataStructures.Lists;

public class MiddleOfLinkedList {

    private Node head;

    public void findMiddleElement(){

        Node slowPointer = head;
        Node fastPointer = head;

        if(head != null){
            while(fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
            System.out.println("Middle element of the linkedList: " + slowPointer.value);
        }
    }

    public void push(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

    }

    public static void main(String[] args) {
        MiddleOfLinkedList middle = new MiddleOfLinkedList();
        middle.push(2);
        middle.push(3);
        middle.push(4);
        middle.push(5);
        middle.push(6);
        middle.push(8);
        middle.push(9);

        middle.findMiddleElement();

    }
}

class Node{
    int value;
    Node next;

    Node(int val){

        this.value = val;
        this.next = null;
    }
}
