package geeks;

import java.util.Hashtable;

public class RearrangeString {

    public static void main(String[] args) {
        RearrangeString rs = new RearrangeString();
        String s = "NFCXCJHWSZFVUBDFQHPVMMDZAMEHOXCEEF16G1I14";
        System.out.println(rs.rearrange(s));
    }

    private String rearrange(String s) {
        if (s == null) return null;

        StringBuilder sb = new StringBuilder();
        Hashtable<Character, Integer> table = new Hashtable<>();
        int sum = 0;
        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(c + "");
                continue;
            }
            if (!table.containsKey(c)) {
                table.put(c, 1);
            } else
                table.replace(c, table.get(c) + 1);
        }
        for (char i = 'A'; i <= 'Z' && !table.isEmpty(); i++) {
            if (table.containsKey(i)) {
                for (int j = 0; j < table.get(i); j++) {
                    sb.append(i);
                }
            }
        }
        return sb.append(sum).toString();
    }
}
