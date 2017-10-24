package linked_lists;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        LinkedList list = new LinkedList(new Node(4));
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println(palindrome.isPalindrome(list));
    }

    boolean isPalindrome(LinkedList list) {
        if (list == null || list.size == 1)
            return true;

        Node slow = list.root;
        Node fast = list.root;
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.getNext() != null) {
            stack.push(slow.getData());
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        if (fast != null)
            slow = slow.getNext();

        int stack_value;
        while (slow != null) {
            stack_value = stack.pop();
            if (slow.getData() != stack_value) {
                return false;
            }
            slow = slow.getNext();
        }
        return true;
    }

}
