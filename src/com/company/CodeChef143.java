/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt(); 

        for (int q = 0; q < Q; q++) {
            int N = sc.nextInt();
            sc.nextLine(); 

            String S = sc.nextLine();
            String T = sc.nextLine();
            String U = sc.nextLine();

            String res = fC(S, T, U);
            System.out.println(res);
        }
    }

    private static String fC(String S, String T, String U) {
        int K = fRV(S, T); 

        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < U.length(); i++) {
            char ch = U.charAt(i);
            
            char sCh = sC(ch, K);

            cipher.append(sCh);
        }

        return cipher.toString();
    }

    private static int fRV(String S, String T) {
        int N = S.length();
        int rV = 0;

        for (int i = 0; i < N; i++) {
            int d = T.charAt(i) - S.charAt(i);
            if (d < 0) {
                d += 26; 
            }

            if (rV == 0) {
                rV = d;
            } else if (rV != d) {
                return -1; 
            }
        }

        return rV;
    }

    private static char sC(char ch, int pos) {
        int os = (ch - 'a' + pos) % 26;
        return (char) ('a' + os);
    }
}






