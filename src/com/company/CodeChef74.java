import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    for(int i = 0; i < n; i++){
		        if(s.charAt(i) == 'A') System.out.print("T");
		        else if(s.charAt(i) == 'T') System.out.print("A");
		        else if(s.charAt(i) == 'G') System.out.print("C");
		        else System.out.print("G");
		    }
		   System.out.println();
		}
		
	}
}
