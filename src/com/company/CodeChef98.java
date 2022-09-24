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
	          int a = sc.nextInt();
	          int b = sc.nextInt();
	          int c = sc.nextInt();
	          int d = sc.nextInt();
	          
	         int e = (int)Math.pow(a, 2);
	         int f = (int)Math.pow(b, 2);
	         
	         int g = (int)Math.pow(c, 3);
	         int h = (int)Math.pow(d, 3);
	         
	         System.out.println((e*h) == (f*g) ? "Yes": "No");
	    }
	}
}
