package com.sda.singleton;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    private static MyQueue instance = new MyQueue();

    public static MyQueue instanceOf(){
        return instance;
    }

    private Queue<String> myQueue;

    private MyQueue() {
        this.myQueue = new LinkedList<String>();
    }

    public void push(String value) {
        myQueue.add(value);
    }
    public String pop() {
        return myQueue.poll();
    }
}
