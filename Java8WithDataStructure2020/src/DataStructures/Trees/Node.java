package DataStructures.Trees;

public class Node<E> {

    int data;
    Node<E> left = null;
    Node<E> right = null;

    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return  data +
                ", " + left +
                ", " + right;
    }
}
