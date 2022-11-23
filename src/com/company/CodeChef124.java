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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int ans=0;
		    
		    while(n > 1){
		        ans++;
		        n=n/2;
		    }
		    System.out.println((ans*a) + (ans-1)*b);
		}
	}
}
