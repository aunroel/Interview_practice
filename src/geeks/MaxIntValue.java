package geeks;

import java.util.Scanner;

public class MaxIntValue {

    public static void main (String[] args) {
        MaxIntValue obj = new MaxIntValue();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long v = obj.maxIntValue(s);
        System.out.println(v);

    }

    public long maxIntValue(String str) {
        if(str == null) return -1;

        long sum = Integer.parseInt(str.charAt(0) + "");
        int first, second;
        for(int i = 0;i < str.length();i++) {
            first = Integer.parseInt(str.charAt(i) + "");
            if(i + 1 < str.length()) {
                second = Integer.parseInt(str.charAt(i + 1) + "");
                if(first + second >= first*second) {
                    sum += second;
                } else {
                    sum *= second;
                }
            } else {
                break;
            }
        }
        return sum;
    }
}
