package main.java.grind75.week3;

import java.util.Stack;

public class P3QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);

        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}

class MyQueue {
    Stack stack1;
    Stack stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.empty()) {
            rebalance();
        }

        return (int) stack2.pop();
    }

    public int peek() {
        if (stack2.empty()) {
            rebalance();
        }

        return (int) stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void rebalance() {
        Stack tempStack = new Stack<>();

        while (!stack2.isEmpty()) {
            tempStack.push(stack2.pop());
        }

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        while(!tempStack.empty()) {
            stack2.push(tempStack.pop());
        }
    }
}
