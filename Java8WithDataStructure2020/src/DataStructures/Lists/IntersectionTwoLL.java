package DataStructures.Lists;

import java.util.HashSet;

public class IntersectionTwoLL {

    public Node getIntersectionNode(Node headA, Node headB){
        HashSet<Node> visited = new HashSet<>();

        while(headA != null){
            visited.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if(visited.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }

    public static void main(String[] args) {
        IntersectionTwoLL intersectionTwoLL = new IntersectionTwoLL();
        // creating first linked list
        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = new Node(9);
        headA.next.next.next = new Node(15);
        headA.next.next.next.next = new Node(30);

        // creating second linked list
        Node headB = new Node(10);
        headB.next = new Node(11);
        headB.next.next = headA.next.next;

        System.out.println(intersectionTwoLL.getIntersectionNode(headA, headB).value);

    }
}
