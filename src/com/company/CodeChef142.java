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
	  int t = sc.nextInt();
	    while(t-->0){
	        int[] aR = new int[3];
            int[] bR = new int[3];

            for (int i = 0; i < 3; i++) {
                aR[i] = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                bR[i] = sc.nextInt();
            }
            
            int aS = cS(aR);
            int bS =  cS(bR);

            if (aS > bS) {
                System.out.println("Alice");
            } else if (aS < bS) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
    }

    private static int cS(int[] rs) {
        int m1 = 0;
        int m2 = 0;

        for (int roll : rs) {
            if (roll > m1) {
                m2 = m1;
                m1 = roll;
            } else if (roll > m2) {
                m2 = roll;
            }
        }

        return m1 + m2;
    }
}
