package stacks_queues;

public class TestStacksSet {

    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks(3);

        for (int i = 0; i < 10; i++) {
            setOfStacks.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(setOfStacks.pop());
        }
        System.out.println(setOfStacks.isEmpty());
        System.out.println(setOfStacks.popAt(0));
        System.out.println(setOfStacks.popAt(0));
        System.out.println(setOfStacks.popAt(0));
        System.out.println(setOfStacks.popAt(0));
        System.out.println(setOfStacks.popAt(0));
    }
}
