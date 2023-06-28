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
      int testCases = sc.nextInt();
      
      while(testCases > 0){
          Long N = sc.nextLong();
          long M = sc.nextLong();
          
          Long s = 0L;
          Long t = N * (N+1)/2;
          
          for(int i = 0; i < M; i++){
              Long abacus = sc.nextLong();
              s += abacus;
            }
            System.out.println(t - s);
             testCases--;
        }
       
	}
}
