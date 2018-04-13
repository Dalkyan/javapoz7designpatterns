package com.sda.singleton;

public class Consumer {

    public void consume(){
        System.out.println(MyQueue.instanceOf().pop());
        System.out.println(MyQueue.instanceOf().pop());
        System.out.println(MyQueue.instanceOf().pop());}
}
