package linked_lists;


public class Intersection {

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        LinkedList linkedList = LinkedList.createTestList();
        LinkedList list = new LinkedList(8);
        list.add(3);
        list.add(2);

        int pos = 5;
        Node temp = linkedList.root;
        while (pos != 0) {
            temp = temp.getNext();
            pos--;
        }
        list.add(temp);
        linkedList.printList();
        list.printList();
        System.out.println(intersection.intersect(linkedList.root, list.root));
        list = LinkedList.createTestList();
        System.out.println(intersection.intersect(linkedList.root, list.root));
    }


    /**
     * Takes O(A*B) times, can be done in O(A+B) tho.
     * Take a look at end of both lists-should be same if intersect
     * @param root1
     * @param root2
     * @return
     */
    boolean intersect(Node root1, Node root2) {
        if (root1 == null || root2 == null)
            return false;
        Node cur1 = root1;
        Node cur2 = root2;

        while (cur1 != null) {
            while (cur2 != null) {
                if (cur1 == cur2)
                    return true;
                cur2 = cur2.getNext();
            }
            cur1 = cur1.getNext();
            cur2 = root2;
        }

        return false;
    }

}
