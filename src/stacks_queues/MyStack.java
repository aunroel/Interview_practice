package stacks_queues;


import java.util.EmptyStackException;

public class MyStack<T> {

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;
        private StackNode<T> min;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
        if (top.next != null){
            if (top.data < top.next.min.data)
                top.min = top;
            else
                top.min = top.next.min;
        }

    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public T min() {

    }

    public boolean isEmpty() {
        return top == null;
    }



}
