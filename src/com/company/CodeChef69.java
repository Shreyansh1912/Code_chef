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
		    int r=sc.nextInt();
		    int s=sc.nextInt();
		   
		   if((r+s)%4==0 || (r+s)%4==1){
		      System.out.println("alice");
		   } else{
		       System.out.println("bob");
		   }
		
		}
		    
	}
}
