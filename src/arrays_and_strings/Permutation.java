package arrays_and_strings;

public class Permutation {

    public static void main(String[] args) {
        Permutation p = new Permutation();
        String s1 = "слово";
        String s2 = "олсов";

        System.out.println(p.isPermutation(s1, s2));
        
    }
    
    private boolean isPermutation(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.length() != s2.length()) 
            return false;
        long char_sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char_sum += s1.charAt(i);
            char_sum -= s2.charAt(i);
        }
         return char_sum == 0;
    }
    
}
