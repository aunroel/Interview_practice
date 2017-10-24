package linked_lists;

import java.util.Hashtable;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        LinkedList list = new LinkedList(new Node(4));
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(palindrome.isPalindrome(list));
    }

    boolean isPalindrome(LinkedList list) {

        return true;
    }

}
