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
		    int n = sc.nextInt();
		    int z = n;
		    
		    int[] new_arr = new int[n];
		    for(int i=0; i<n; i++){
		        new_arr[i] = sc.nextInt();
		    }
		    
		    for(int i=1; i<n; i++){
		        new_arr[i] = new_arr[i] ^ new_arr[i-1];
		        new_arr[i-1] = 0;
		        
		    }
		    for(int i=0; i<n; i++){
		        if(new_arr[i] != 0) z--;
		    }
		    if(z < n-1){
		        System.out.println("No");
		    }
		    else if(z == n-1){
		        int res = (n-1) % 2;
		        if(res == 0) System.out.println("Yes");
		        else System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");
		    }
		
		    
		}
	}
}
