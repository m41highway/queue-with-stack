package com.m41highway.SimpleQueue;

public class Application {

    public static void main (String [] args) {

        try {
            MyQueue myQueue = new MyQueue();
            myQueue.enQueue("A");
            myQueue.enQueue("B");

            System.out.println(myQueue.deQueue());
            System.out.println(myQueue.deQueue());

            myQueue.enQueue("C");
            System.out.println(myQueue.deQueue());

            System.out.println(myQueue.deQueue());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
