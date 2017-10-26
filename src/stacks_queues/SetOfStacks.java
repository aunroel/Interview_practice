package stacks_queues;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SetOfStacks {

    private  ArrayList<MyStack<Integer>> stack_list = new ArrayList<>();
    private int max_stack_capacity;

    SetOfStacks(int capacity) {
        max_stack_capacity = capacity;
    }

    public void push(int data) {
        if (stack_list.isEmpty()) {
            stack_list.add(new MyStack<>());
            stack_list.get(stack_list.size() - 1).push(data);
        } else {
            if (stack_list.get(stack_list.size()-1).getSize() == max_stack_capacity) {
                stack_list.add(new MyStack<>());
                stack_list.get(stack_list.size() - 1).push(data);
            } else {
                stack_list.get(stack_list.size()-1).push(data);
            }
        }
    }

    public int pop() {
        if (stack_list.isEmpty()) throw new NoSuchElementException();
        int value;
        if (stack_list.get(stack_list.size()-1).getSize() == 1) {
            value = stack_list.get(stack_list.size()-1).pop();
            stack_list.remove(stack_list.size()-1);
        } else {
            value = stack_list.get(stack_list.size()-1).pop();
        }
        return value;
    }

    public int popAt(int stack) {
        if (stack_list.isEmpty()) throw new NoSuchElementException();
        if (stack >= stack_list.size()) throw new NoSuchElementException();

        int value;
        if (stack_list.get(stack).getSize() == 1) {
            value = stack_list.get(stack).pop();
            stack_list.remove(stack);
        } else {
            value = stack_list.get(stack).pop();
        }

        return value;
    }

    public int peek() {
        if (stack_list.isEmpty()) throw new NoSuchElementException();
        return stack_list.get(stack_list.size()-1).peek();
    }

    public boolean isEmpty() {
        return stack_list.isEmpty();
    }

}
