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
		    String str = sc.next();
		    
		    String s = str.substring(0,n/2);
		    String s1 = str.substring(n/2, n);
		    
		    if(s.equals(s1)) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
