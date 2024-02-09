/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

/**
 *
 * @author mario
 */
import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> value;

    public MyQueue() {
        value = new LinkedList<>();
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public void queue(T item) {
        value.add(item);
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("The Queue is Empty");

        return value.get(0);
    }

    public T enqueue() {
        if (isEmpty())
            throw new RuntimeException("The Queue is Empty");

        T number = value.get(0);
        value.remove(0);
        return number;
    }

    public static void main(String[] args) {
        MyQueue<Integer> stack = new MyQueue<>();
        stack.queue(1);
        stack.queue(2);
        stack.queue(3);
        stack.enqueue();
        /*
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.enqueue());
        System.out.println("Peek after pop: " + stack.peek());
        */
    }
}
