package linked_lists;

public class SumLists {

    public static void main(String[] args) {
        SumLists sl = new SumLists();
        LinkedList list1 = new LinkedList(new Node(7));
        LinkedList list2 = new LinkedList(new Node(5));

        list1.add(1);
        list1.add(6);

        list2.add(9);
        list2.add(2);

        LinkedList sum = sl.sumLists(list1, list2);
        sum.printList();
    }

    LinkedList sumLists(LinkedList list1, LinkedList list2) {
        LinkedList ret;
        int sum = 0;

        int digit_index = 1;
        Node cur_node = list1.root;
        while (cur_node != null) {
            sum += cur_node.getData() * digit_index;
            digit_index *= 10;
            cur_node = cur_node.getNext();
        }
        cur_node = list2.root;
        digit_index = 1;
        while (cur_node != null) {
            sum += cur_node.getData() * digit_index;
            digit_index *= 10;
            cur_node = cur_node.getNext();
        }
        System.out.println(sum);
        String s = sum + "";
        ret = new LinkedList(new Node(Integer.parseInt(s.charAt(s.length() - 1) + "")));

        for (int i = s.length() - 2; i>= 0 ; i--) {
            ret.add(Integer.parseInt(s.charAt(i) + ""));
        }

        return ret;

    }


}
