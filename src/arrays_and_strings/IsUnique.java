package arrays_and_strings;

import java.util.Hashtable;

public class IsUnique {

    Hashtable<Character, Integer> table;

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        String test = "qwertyuiqopasdvcxz";
        System.out.println(isUnique.isUnique(test));
    }


    boolean isUnique(String string) {
        table = new Hashtable<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!table.containsKey(c))
                table.put(c, 1);
            else
                return false;
        }
        return true;
    }

}
