package com.sda.singleton;

public class Application {

    public static void main(String[] args) {
        MyQueue myQueue = MyQueue.instanceOf();
        myQueue.push("Kleofas");
        myQueue.push("Hieronim");
        myQueue.push("Esteban");
        Consumer consumer = new Consumer();
        consumer.consume();
    }
}
