package DataStructures.Stack;

import java.util.Stack;

public class MinimumStack {

    Stack<Integer> stack;
    Integer minElement;

    public MinimumStack(){
        stack = new Stack<>();
    }

    public void push(int val){

    }

    public void peek(){
        if(stack.isEmpty()){
            System.out.println();
        }
    }

    public void pop(){

    }

    public void getMin(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(minElement);
        }
    }

    public static void main(String[] args) {

    }
}
