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
	     while (testCases > 0) {
	       int n=sc.nextInt();
		   int x=sc.nextInt();
		   int k=sc.nextInt();
		   int p=sc.nextInt();

	       int karan=k;
		   if(karan!=0){ 
		     int too=p;
		     if(x >= k){
		       
		       int multiple=k*10;
		        if(k==n)
		          multiple+=20;
		          too+=multiple;
		      } 
		     else if(x<k){  
		       int multiple=x*10;
		         too+=multiple;
		         k-=x;
		         multiple=k*5;
		         too+=multiple;
		       
		         if(karan==n)
		         too += 20;
		      }
		    System.out.println(too);
		   }
		   else{
		       System.out.println(p);
		   }
		  testCases--;
		}
    }
}


