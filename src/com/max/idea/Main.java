package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(in);
        System.out.println("input line:");
        String a = inp.nextLine();
        String[] res = a.split(" ");
        String[] result = new String[res.length];
        String eng = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c;
        boolean b;
        int j=0;
        for (int i=0; i<res.length; i++){
            b=true;
            for (int w=0; w<res[i].length(); w++) {
                c =res[i].charAt(w);
                b &= (eng.indexOf(c)>-1);
                //System.out.printf("%c %d %b\n", c ,eng.indexOf(c), b);
                }
            if (b) {
                result[j]=res[i];
                j++;
            }

            }

        System.out.printf("Number of english words: %d\n", j);
    }
}