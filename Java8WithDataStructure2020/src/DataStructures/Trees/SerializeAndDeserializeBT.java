package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBT {

    // BFS technique to serialize and deserialize the Binary tree
    public String serializeBFS(Node root){
        if(root == null) return "";
        Queue<Node> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);

        while (!q.isEmpty()){
            Node node = q.poll();
            if(node == null){
                sb.append("n ");
                continue;
            }

            sb.append(node.data + " ");
            q.add(node.left);
            q.add(node.right);

        }
        return sb.toString();
    }

    public Node deserializeBFS(String data){
        if(data =="") return null;
        Queue<Node> q = new LinkedList<>();
        String[] values = data.split(" ");
        Node root = new Node(Integer.parseInt(values[0]));
        q.add(root);

        for(int i = 1; i < values.length; i++){
            Node parent = q.poll();
            if(!values[i].equals("n")){
                Node left = new Node(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            if(!values[++i].equals("n")){
                Node right = new Node(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }

    // PreOrder technique to serialize and deserialize the Binary tree




    public static void main(String[] args) {

        SerializeAndDeserializeBT serializeAndDeserializeBT = new SerializeAndDeserializeBT();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        System.out.println(serializeAndDeserializeBT.serializeBFS(root));

        String serializedTree = serializeAndDeserializeBT.serializeBFS(root);
        System.out.println(serializeAndDeserializeBT.deserializeBFS(serializedTree).toString());

    }
}
