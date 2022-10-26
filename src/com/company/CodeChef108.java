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
		    String s = sc.next();
		    int c=0;
		    for(int i=1; i<n; i++){
		        if(s.charAt(i) == '0' && s.charAt(i-1) == '1')
		          c++;
		    }
		    System.out.println(c);
		}
	}
}
