package DataStructures.Lists;

public class IntersectingLL {

    public int getCount(Node node){
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    public int getNode(Node headA, Node headB){
        int lenNodeA = getCount(headA);
        int lenNodeB = getCount(headB);

        int diffOfNodes;

        if(lenNodeA >= lenNodeB){
            diffOfNodes = lenNodeA - lenNodeB;
        }else{
            diffOfNodes = lenNodeB - lenNodeA;
        }
        return getIntersectionNode(headA, headB, diffOfNodes);
    }

    public int getIntersectionNode(Node headA, Node headB, int diffOfNodes) {

        for(int i = 0; i < diffOfNodes; i++){
            if(headA == null){
                return -1;
            }
            headA = headA.next;
        }

        while(headA != null && headB != null){
            if(headA.value == headB.value){
                return headA.value;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return -1;
    }

    public static void main(String[] args) {

        IntersectingLL intersectingLL = new IntersectingLL();
        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = new Node(9);
        headA.next.next.next = new Node(15);
        headA.next.next.next.next = new Node(30);

        Node headB = new Node(10);
        headB.next = new Node(15);
        headB.next.next = new Node(30);

        System.out.println("The node of intersection is " + intersectingLL.getNode(headA, headB));
    }
}
