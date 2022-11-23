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
		    int p = sc.nextInt();
		    int q = sc.nextInt();
		    int r = sc.nextInt();
		    int s = sc.nextInt();
		    
		    if(s%((p*r)+q) == 0) System.out.println("Yes");
		    
		    else if(s%((p*r)+q) -p*(r-1) > 0)
		        System.out.println("Yes"); 
		     else
		        System.out.println("No");
		    
		}
	}
}
