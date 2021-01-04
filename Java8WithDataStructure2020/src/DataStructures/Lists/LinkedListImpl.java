package DataStructures.Lists;

import java.util.LinkedList;

public class


LinkedListImpl<E>{

        private Node<E> head;
        private Node<E> tail;
        private int currentSize;

        public LinkedListImpl(){
            this.head = null;
            this.tail = null;
            this.currentSize = 0;
        }

        public void addFirst(E obj){
            Node<E> node = new Node<>(obj);
            if(head == null){
                head = tail = node;
                this.currentSize++;
                return;
            }

            node.next = head;
            head = node;
            this.currentSize++;
            return;
        }

        public void addLast(E obj){
            Node<E> node = new Node<>(obj);
            if(head == null){
                head = tail = node;
                this.currentSize++;
                return;
            }
            tail.next = node;
            tail = node;
            currentSize++;
        }

        public E removeFirst(){
            if(head == null)
                return null;
            E tmp = head.data;
            if(head == tail)
                head = tail =  null;
            else
                head = head.next;
            this.currentSize--;
            return tmp;
        }

        public E removeLast(){
            if(head == null)
                return null;
            if(head == tail)
                return removeFirst();
            Node<E> current = head;
            Node<E> previous = null;

            while(current != tail){
                previous = current;
                current = current.next;
            }

            previous.next = null;
            tail = previous;
            currentSize--;
            return current.data;
        }

        public void printList(LinkedListImpl<E> list){
            Node currNode = list.head;
            System.out.print("Linked List: ");
            if(currNode == null)
                return;
            while(currNode.next != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.print(currNode.data);
        }

        public int getCurrentSize(){
            return this.currentSize;
        }

    class Node<E> {
        E data;
        Node<E> next;

        public Node(E obj) {
            data = obj;
            next = null;
        }
    }
        
}

class MainLL{
    public static void main(String[] args) {
        LinkedListImpl<Integer> list = new LinkedListImpl<>();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);
        list.addLast(11);

        list.printList(list);
        System.out.println();
        System.out.println(list.getCurrentSize());
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeLast();
        list.removeLast();
        list.removeFirst();
        list.printList(list);

    }
}

