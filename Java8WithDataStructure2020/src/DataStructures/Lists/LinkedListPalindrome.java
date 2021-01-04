package DataStructures.Lists;

import java.util.Stack;

public class LinkedListPalindrome {

    Node head;
    // Method to check palindrome by reversing half of linked list.
    public boolean isPalindrome(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reversed(slow);
        fast = head;

        while(slow != null){
            if(slow.value != fast.value){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public Node reversed(Node head){
        Node prev = null;

        while(head != null){
            Node node = head.next;
            head.next = prev;
            prev = head;
            head = node;
        }
        return prev;
    }

    public boolean isPalindromeStack(Node head){
        Node curr = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack();

        while(curr != null){
            stack.push(curr.value);
            curr = curr.next;
        }

        while(head != null){
            int i = stack.pop();
            if(head.value == i){
                isPalindrome = true;
            }else{
                isPalindrome = false;
                break;
            }

            head = head.next;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(2);
        //head.next.next.next.next.next = new Node(1);

        LinkedListPalindrome palindrome = new LinkedListPalindrome();
        /*boolean result = palindrome.isPalindrome(head);

        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }*/

        boolean result2 = palindrome.isPalindromeStack(head);

        if(result2){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
}
