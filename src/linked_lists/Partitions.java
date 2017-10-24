package linked_lists;

public class Partitions {

    public static void main(String[] args) {
        Partitions partitions = new Partitions();
//        LinkedList list = LinkedList.createTestList();
        LinkedList list = new LinkedList(new Node(3));
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);
        list.printList();
        list = partitions.partition(list, 5);
        list.printList();

    }

    LinkedList partition(LinkedList list, int partition_value) {
        if (list == null || list.size == 1)
            return list;
        LinkedList smaller = null, bigger = null;
       Node cur_node = list.root;
       while (cur_node != null) {
           if (cur_node.getData() < partition_value) {
               if (smaller == null)
                   smaller = new LinkedList(new Node(cur_node.getData()));
                else
                    smaller.add(cur_node.getData());
           } else {
               if (bigger == null)
                   bigger = new LinkedList(new Node(cur_node.getData()));
               else
                   bigger.add(cur_node.getData());
           }
           cur_node = cur_node.getNext();
       }
       smaller.add(bigger.root);
       return smaller;
    }
}
