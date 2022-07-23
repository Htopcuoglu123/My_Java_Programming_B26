package day60_collections;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {
        Stack<Character>stack=new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');//d is on top of my stack since it is the most recent one
        stack.pop();//removes the element ta the top of your stack and returns it
        System.out.println(stack);
        System.out.println("Top of my stack: "+stack.peek());//returns what is at the top of my stack
        System.out.println(stack.pop());//removes c whic is at the top of the stack and returns it
        System.out.println(stack);
        System.out.println(stack.remove(0));//removing the element from index 0, not following lifo in this method
        System.out.println(stack);
    }
}
