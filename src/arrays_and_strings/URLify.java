package arrays_and_strings;

import java.util.Arrays;

public class URLify {

    public static void main(String[] args) {
        URLify urLify = new URLify();
        String s = "I am sick of this work          ";
        System.out.println(urLify.whitespaceReplacer(s.toCharArray(), 22));
    }

    String whitespaceReplacer(char[] s, int str_length) {
        int index_corrector = 0;
        char[] res = new char[s.length];
        for (int i = 0; i < str_length; i++) {
            if (s[i] != ' ') {
                res[i + index_corrector] = s[i];
            } else {
                res[i + index_corrector] = '%';
                res[i + index_corrector + 1] = '2';
                res[i + index_corrector + 2] = '0';
                index_corrector += 2;
            }
        }
        return new String(res);
    }
}
