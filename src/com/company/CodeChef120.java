/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] arr = new int[n];
		    int flag=0;
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		     for(int i=0; i<n; i++){
		         if(arr[i] == k && i!=n-1){
		             flag=1;
		         }
		     }
		     if(n == 1 && k == arr[0]){
		         System.out.println("Yes");
		         continue;
		     }
		     if(flag == 0) System.out.println("No");
		     else System.out.println("Yes");
		
		}
	}
}
