import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef61
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int N=sc.nextInt();
		    int X=sc.nextInt();
		    int Z=N/(3*X);
		    System.out.println(Z);
		}
	}
}
