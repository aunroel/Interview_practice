package stacks_queues;

public class StackQueueTest {

    public static void main(String[] args) {
        QueueViaStacks qvs = new QueueViaStacks();
        qvs.add(4);
        qvs.add(3);
        qvs.add(7);
        System.out.println(qvs.remove());
        System.out.println(qvs.remove());
        System.out.println(qvs.remove());
        System.out.println(qvs.isEmpty());
        qvs.add(5);
        qvs.add(7);
        qvs.add(3);
        System.out.println(qvs.peek());
        qvs.remove();
        System.out.println(qvs.peek());
    }

}

