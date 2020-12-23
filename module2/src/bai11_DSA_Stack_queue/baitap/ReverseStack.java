package bai11_DSA_Stack_queue.baitap;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        Stack<Integer> stack1 = new Stack<>();
        for (int i = (stack.size()-1) ; i >=0 ; i--){
            stack1.push(stack.pop());
        }
        System.out.println(stack1);

        Stack<String> word = new Stack<>();
        word.push("one");
        word.push("two");
        word.push("three");
        word.push("four");
        word.push("five");

        System.out.println(word);
        Stack<String> word1 = new Stack<>();
        for (int i = (word.size()-1) ; i >= 0 ; i--){
            word1.push(word.pop());
        }
        System.out.println(word1);

    }
}





































































































