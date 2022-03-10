package com.company;

import java.util.Scanner;

public class CodeChef3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int k = 0;
            String a;
            a = s.next();
            int z = a.length();
            for (int i = 0; i < z - 1; i++) {
                if (a.charAt(i) == '<') {
                    if (a.charAt(i + 1) == '>') {
                        k++;
                    }

                }
            }
            System.out.println(k);
        }
    }
}
