package stacks_queues;


public class SortStack {

    public static void main(String[] args) {
        SortStack sortStack = new SortStack();
        MyStack<Integer> stack = new MyStack<>();
        stack.push(8);
        stack.push(1);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(11);

        sortStack.sortStack(stack);
        System.out.println(stack.peek());
    }

    private void sortStack(MyStack<Integer> stack) {
        if (stack == null) return;

        MyStack<Integer> temp = new MyStack<>();

        while (!stack.isEmpty()) {
            int t = stack.pop();

            while(!temp.isEmpty() && temp.peek() > t) {
                stack.push(temp.pop());
            }
            temp.push(t);
        }

        while (!temp.isEmpty())
            stack.push(temp.pop());

    }


}
