package com.m41highway.SimpleQueue;

import java.util.Stack;

public class MyQueue  {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    void enQueue(Object o) {
        stack1.push(o);
    }

    Object deQueue() throws Exception{

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty())
            throw new Exception ("Empty queue!");
        else
            return stack2.pop();
    }
}
