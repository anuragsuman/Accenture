package DataStructures.Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minElement;

    public MinStack(){
        stack = new Stack<>();;
        minElement = new Stack<>();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minElement.peek();
    }

    public void push(int val){
        if(minElement.isEmpty() || val <= minElement.peek()){
            minElement.push(val);
        }
        stack.push(val);
    }

    public void pop(){
        if(minElement.peek().equals(stack.peek())){
            System.out.println("Top min value is popped: " + minElement.pop());
        }
        System.out.println("Top value from stack is popped: " + stack.pop());
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(7);
        minStack.push(5);
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.pop();
        System.out.println("Minimum values in a Min stack: "+minStack.getMin());

    }
}
