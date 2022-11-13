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
		    int a = sc.nextInt();//in
		    int b = sc.nextInt();//f
		    int x = sc.nextInt(); //hot
		    int y = sc.nextInt(); //cold
		    
		    int perfect = a-b;
		    
		    if(perfect == 0) 
		    {
		        System.out.println("YES");
		    }
		    else if(perfect < 0){
		        if(Math.abs(perfect) <= x)
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		        
		    }
		    else{
		        if(Math.abs(perfect) <= y)
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		   }
		    
		}
	}
}
