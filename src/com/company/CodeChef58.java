import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef58
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x= sc.nextInt();
		    int y= sc.nextInt();
		    int divisor= sc.nextInt();
		    int rem=0;
		    
		    int dividend = ((x*5) + (y*10));
		    //int rem = dividend % divisor;
		    int ans = (dividend/divisor)-rem;
		    System.out.println(ans);
		    
		}
	}
}
