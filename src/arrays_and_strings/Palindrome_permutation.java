package arrays_and_strings;

import java.util.Hashtable;

public class Palindrome_permutation {

    Hashtable<Character, Integer> table;

    public static void main(String[] args) {
        Palindrome_permutation palindrome_permutation = new Palindrome_permutation();
        String test = "tact cao";
        System.out.println(palindrome_permutation.palPerm(test));
    }

    boolean palPerm(String string) {
        if (string == null || string.isEmpty())
            return false;

        String temp = string.toLowerCase().replaceAll(" ", "");
        table = new Hashtable<>();
        int odd_char_count = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (!table.containsKey(temp.charAt(i))) {
                table.put(temp.charAt(i), 1);
                odd_char_count++;
            } else {
                table.replace(temp.charAt(i), table.get(temp.charAt(i)) + 1);
                if (table.get(temp.charAt(i)) % 2 == 0)
                    odd_char_count--;
                else
                    odd_char_count++;
            }
        }
        table = null;
        return odd_char_count < 2;
    }

}
