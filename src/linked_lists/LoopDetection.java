package linked_lists;

public class LoopDetection {

    public static void main(String[] args) {
        LoopDetection ld = new LoopDetection();
        LinkedList ll = LinkedList.createTestList();
        Node loop_entry = null;
        Node temp = ll.root;
        while (temp.getNext() != null) {
            if (temp.getData() == 5)
                loop_entry = temp;
            temp = temp.getNext();
        }
        System.out.println(loop_entry.getData());
        ll.printList();
        temp.setNext(loop_entry);
        Node res = ld.hasLoop(ll.root);
        if (res != null)
            System.out.println(res.getData());
        else
            System.out.println("No loop");
    }

    Node hasLoop(Node root) {
        if (root == null)
            return null;
        if (root.getNext() == null)
            return null;

        Node slow = root;
        Node fast = root;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (fast == slow)
                break;
        }
        if (fast == null || fast.getNext() == null)
            return null;

        slow = root;
        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return fast;
    }

}
