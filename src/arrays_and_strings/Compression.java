package arrays_and_strings;

public class Compression {

    public static void main(String[] args) {
        Compression comp = new Compression();
        String test = "aabcccccaaa";
        System.out.println(comp.compress(test));

    }

    String compress(String s) {
        if (s == null || s.isEmpty())
            return s;

        StringBuilder sb = new StringBuilder();
        char letter = ' ';
        int letter_counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (letter_counter == 0) {
                letter = s.charAt(i);
                sb.append(letter);
            }
            if (letter != s.charAt(i)) {
                letter = s.charAt(i);
                sb.append(letter_counter);
                letter_counter = 1;
                sb.append(s.charAt(i));
            } else {
                letter_counter++;
            }
        }
        sb.append(letter_counter);

        return (sb.toString().length() >= s.length()) ? s : sb.toString();
    }
}
