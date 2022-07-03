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
		    int N = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x + (2*y) <= N) System.out.println("YES");
		    else System.out.println("NO");
		    
		}
	}
}
