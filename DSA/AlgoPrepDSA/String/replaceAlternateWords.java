package String;

import java.util.ArrayList;

public class replaceAlternateWords {

    public static void main(String[] args) {
        String s = "i.like.this.program.very";
        replace(s);
    }

    public static void replace(String s) {
        String[] arr = new String[s.length() - 1];
        char c = 0;
        String temp = "";
        int i = 0, j = 0, count = 1;

        for (i = 0; i <= s.length() - 1; i++) {
            c = s.charAt(i);
            if (c != '.') {
                temp = temp + c;
            } else {
                if (count % 2 == 0) {
                    arr[j] = ".xyz.";
                } else {
                    arr[j] = temp;
                }
                j++;
                count++;
                temp = "";
            }
        }

        if (count % 2 == 0) {
            arr[j] = ".xyz";
        } else {
            int l = s.length() - 1;
            temp = "" ;
            while (s.charAt(l) != '.') {
                temp = s.charAt(l) + temp  ;
                l--;
            }
           arr[j] = temp ;
        }

        int k = 0;
        while (arr[k] != null) {
            System.out.print(arr[k]);
            k++;
        }

    }
}
