package stacks_queues;

import java.util.NoSuchElementException;

public class QueueViaStacks {

    private MyStack<Integer> in_stack = new MyStack<>();
    private MyStack<Integer> out_stack = new MyStack<>();


    public void add(int data) {
        in_stack.push(data);
    }

    public int remove() {
        int value;
        if (!out_stack.isEmpty()) {
            value = out_stack.pop();
        } else {
            if (in_stack.isEmpty())
                throw new NoSuchElementException();
            reformat();
            value = out_stack.pop();
        }
        return value;
    }

    private void reformat() {
        if (!out_stack.isEmpty())
            return;

        while (!in_stack.isEmpty()) {
            out_stack.push(in_stack.pop());
        }
    }

    public int peek() {
        if (out_stack.isEmpty() && in_stack.isEmpty())
            throw new NoSuchElementException();
        if (out_stack.isEmpty())
            reformat();
        return out_stack.peek();
    }

    public boolean isEmpty() {
        return in_stack.isEmpty() && out_stack.isEmpty();
    }

}
