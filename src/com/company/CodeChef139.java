/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int testCases= sc.nextInt();
		while(testCases-->0){
		int N= sc.nextInt();
		int M= sc.nextInt();
		int K= sc.nextInt();
		
		int[] a = new int[N];
		for(int i=0;i<N;i++) 
		   a[i]= sc.nextInt();
		
		boolean serum= false;
		
		for(int i=0;i<N;i++){
		    if(a[i]+K > M+1){
		        serum=true;
		        break;
		    }
		}
		
		System.out.println(serum == true ? "No": "Yes");
		}

	}
}
