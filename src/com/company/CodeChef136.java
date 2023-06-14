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

        while(t-->0) {
            int n = sc.nextInt(); 
            
            int[] o = new int[n]; 
            int[] a = new int[n]; 

         
            for (int i= 0; i < n; i++) {
                o[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            int oMax = getMax(o);
            int aMax = getMax(a);

            if (oMax > aMax) {
                System.out.println("om");
            } else if (aMax > oMax) {
                System.out.println("addy");
            } else {
                System.out.println("draw");
            }
        }
    }

    static int getMax(int[] arr) {
        int max = 0;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 0;
            }
        }

        return max;
    }
}

