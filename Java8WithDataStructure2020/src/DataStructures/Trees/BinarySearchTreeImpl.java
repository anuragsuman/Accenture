package DataStructures.Trees;

public class BinarySearchTreeImpl {

    Node root;

    public Node addRecursively(Node current, int value){
        if(current == null)
            return new Node(value);

        if(value < current.data){
            current.left = addRecursively(current.left, value);
        }
        else if(value > current.data){
            current.right = addRecursively(current.right, value);
        }
        else{
            return current;
        }
        return current;
    }

    public void add(int value){
        root = addRecursively(root, value);
    }

    public boolean containsNode(Node current, int value){
        if(current == null)
            return false;
        if(value == current.data)
            return true;
        return value < current.data ? containsNode(current.left, value) : containsNode(current.right, value);

    }

    public boolean containsNode(int value){
        return containsNode(root, value);
    }



    public static void main(String[] args) {
        BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
        bst.add(6);
        bst.add(4);
        bst.add(8);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        System.out.println(bst.containsNode(15));
    }
}
