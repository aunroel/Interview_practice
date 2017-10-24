package linked_lists;

public class DeleteMiddleNode {

    public static void main(String[] args) {
        DeleteMiddleNode middleNode = new DeleteMiddleNode();
        LinkedList linkedList = LinkedList.createTestList();
        linkedList.printList();
        middleNode.deleteMiddleNode(linkedList.find(5));
        /* Need to keep in mind that list size is not updated, since it's not regular removal */
        linkedList.size = linkedList.size - 1;
        linkedList.printList();

    }

    void deleteMiddleNode(Node node) {
        if (node.getNext() == null)
            return;

        node.setData(node.getNext().getData());
        node.setNext(node.getNext().getNext());
    }

}
