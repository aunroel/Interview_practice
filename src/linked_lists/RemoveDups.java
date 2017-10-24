package linked_lists;

import java.util.Hashtable;

public class RemoveDups {

    public static void main(String[] args) {
        RemoveDups dups = new RemoveDups();
        LinkedList linkedList = new LinkedList(new Node(12));
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
            linkedList.add(i);
        }
        dups.removeDuplicates(linkedList);
        System.out.println(linkedList.size);
        linkedList.printList();
    }

    void removeDuplicates(LinkedList list) {
        Hashtable<Integer, Integer> unique_nodes = new Hashtable<>();
        Node curr_node = list.root;
        while (curr_node != null) {
            if (!unique_nodes.containsKey(curr_node.getData())) {
                unique_nodes.put(curr_node.getData(), 1);
            } else {
                list.remove(curr_node.getData());
            }
            curr_node = curr_node.getNext();
        }
    }


}
