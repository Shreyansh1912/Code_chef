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
		    int c = a/5;
		    if(a%5==0){
		        c--;
		    }
		    int d = b/5;
		    if(b%5==0){
		        d--;
		    }
		    System.out.println(c-d);
		    
		}
	}
}
