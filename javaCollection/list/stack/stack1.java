package javaCollection.list.stack;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack1= new Stack<>();
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
        System.out.println(stack1.toString());
        stack1.add(1);
        stack1.remove(2);
        System.out.println(stack1.toString());


    }
    
}
