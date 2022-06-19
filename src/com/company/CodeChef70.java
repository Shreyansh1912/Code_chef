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
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int floor1 = (x1/10) + Math.min(1, x1 % 10);
		    int floor2 = (x2/10) + Math.min(1, x2 % 10);
		    
		    int d = Math.abs(floor1 - floor2);
		    System.out.println(d);
		    
		    
		}
	}
}
