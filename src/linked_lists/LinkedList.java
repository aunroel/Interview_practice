package linked_lists;

public class LinkedList {

    Node root;
    int size = 0;

    LinkedList(int d) {
        root = new Node(d);
        size = 1;
    }

    LinkedList(Node root) {
        this.root = root;
        size = 1;
    }


    void add(int data) {
        Node last_node = root;
        Node new_node = new Node(data);
        while (last_node.getNext() != null) {
            last_node = last_node.getNext();
        }
        last_node.setNext(new_node);
        size++;
    }

    void add(Node n) {
        Node last_node = root;
        while (last_node.getNext() != null) {
            last_node = last_node.getNext();
        }
        last_node.setNext(n);
        size++;
    }

    void remove(int data) {
        Node curr_node = root;

        if (curr_node.getData() == data) {
            root = curr_node.getNext();
            size--;
        }

        while (curr_node.getNext() != null) {
            if (curr_node.getNext().getData() == data) {
                curr_node.setNext(curr_node.getNext().getNext());
                size--;
            }
            curr_node = curr_node.getNext();
        }
    }

    Node find(int data) {
        Node curr_node = root;
        while (curr_node.getNext() != null) {
            if (curr_node.getData() == data ) {
                return curr_node;
            } else {
                curr_node = curr_node.getNext();
            }
        }
        if (curr_node.getData() == data)
            return curr_node;
        else
            return null;
    }

    static LinkedList createTestList() {
        LinkedList linkedList = new LinkedList(new Node(12));
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    void printList() {
        Node curr_node = root;

        while (curr_node != null) {
            System.out.print(curr_node.getData() + "->");
            curr_node = curr_node.getNext();
        }
        System.out.println("null");
    }

}
