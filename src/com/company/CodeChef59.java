import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef59
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int t1 = sc.nextInt();
		    int t2 = sc.nextInt();
		    int t3 = sc.nextInt();
		    int t4 = sc.nextInt();
		    
		   int x = Math.max(t1,t2);
		   int y = Math.max(t3,t4);
		   
		   if(x == y) System.out.println("TIE");
		   else if(x > y) System.out.println("Q");
		   else System.out.println("P");
		   
		    
		    
		    
		}
	}
}
