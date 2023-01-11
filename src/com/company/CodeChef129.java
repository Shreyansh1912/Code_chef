/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int y = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int ans = arr[0];
		    for(int i=1; i<n; i++){
		        ans = ans | arr[i];
		    }
		    ans = y - ans;
		    int res = ans & y;
		    
		    if(ans == res){
		        System.out.println(ans);
		    } else{
		        System.out.println("-1");
		    }
		}
	}
}
