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
		    int x = sc.nextInt();
		 
		    String s1 = String.valueOf(x);
		    boolean flag=false;
		    for(int i=0; i<s1.length(); i++){
		        if(s1.charAt(i) == '7'){
		          flag=true;
		          break;
		        }
		  }
		  if(flag == false) 
		  {
		      System.out.println("No");
		  }
		  else 
		  {
		      System.out.println("Yes");
		  }
		  
		}
	}
}
