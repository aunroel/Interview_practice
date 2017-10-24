package arrays_and_strings;

public class String_rotation {

    public static void main(String[] args) {
        String_rotation rotation = new String_rotation();
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(rotation.isRotation(s1, s2));
    }

    boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length())
            return false;
        String check = s1.concat(s1);
//        return isSubstring(check, s2);
        return check.contains(s2);
    }

}
