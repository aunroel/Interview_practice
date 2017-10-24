package linked_lists;

public class KthToLast {

    public static void main(String[] args) {
        KthToLast kth = new KthToLast();
        LinkedList linkedList = new LinkedList(new Node(12));
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        Node res_with_size = kth.findFromTheEnd(2, linkedList);
        System.out.println(res_with_size.getData());
        Node res_without_size = kth.findNodeFromTheEnd(9, linkedList);
        System.out.println(res_without_size.getData());

    }

    /**
     * Solution if the size of list is known
     * @param index
     * @param list
     * @return kth Node from the end of the list
     */
    Node findFromTheEnd(int index, LinkedList list) {
        Node curr_node = list.root;
        int counter = 0;
        if (index >= list.size)
            return null;

        if (index == list.size - 1)
            return curr_node;

        while (curr_node != null) {
            if (counter == list.size - 1 - index) {
                return curr_node;
            } else {
                counter++;
                curr_node = curr_node.getNext();
            }
        }
        return null;
    }

    /**
     * If size is unknown
     * @param index
     * @param list
     * @return
     */
    Node findNodeFromTheEnd(int index, LinkedList list) {
        Node curr_node = list.root;
        int l_size = 0;

        while (curr_node != null) {
            l_size++;
            curr_node = curr_node.getNext();
        }

        if (index >= l_size)
            return null;
        if (index == l_size - 1)
            return list.root;

        curr_node = list.root;
        for (int i = 0; i < l_size - 1 - index; i++) {
            curr_node = curr_node.getNext();
        }

        return curr_node;
    }
}
