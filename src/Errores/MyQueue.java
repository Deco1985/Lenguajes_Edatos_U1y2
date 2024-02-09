import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> value;
    private int begin;

    public MyQueue() {
        value = new LinkedList<>();
        begin = 0;
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public void push(T item) {
        value.add(item);
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Can't peek here");

        return value.get(value.size() - 1);
    }

    public T pop() {
        if (isEmpty())
            throw new RuntimeException("Can't pop here");

        T number = value.get(begin);
        value.set(begin, null);
        // value.remove(value.size() - 1);
        begin++;
        return number;
    }

    public static void main(String[] args) {
        MyQueue<Integer> stack = new MyQueue<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();/*
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek after pop: " + stack.peek());
    */}
}