package arrays_and_strings;

public class One_away {

    public static void main(String[] args) {
        One_away one_away = new One_away();
        String s1 = "pale";
        String s2 = "bale";
        String s3 = "ple";
        String s4 = "pales";
        String s5 = "bake";
        System.out.println(one_away.oneAway(s1, s2));
        System.out.println(one_away.oneAway(s1, s3));
        System.out.println(one_away.oneAway(s1, s4));
        System.out.println(one_away.oneAway(s1, s5));

    }

    boolean oneAway(String s1, String s2) {
        if (s1 == null && s2 == null)
            return true;

        if (s1.equals(s2))
            return true;

        int length_difference = Math.abs(s1.length() - s2.length());
        if (length_difference > 1)
            return false;

        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.length() == s2.length()) {
                    return s1.substring(i + 1).equals(s2.substring(i + 1));
                } else if (s1.length() < s2.length()) {
                    return s1.substring(i).equals(s2.substring(i + 1));
                } else
                    return s1.substring(i + 1).equals(s2.substring(i));
            }
        }

        return true;
    }
}
