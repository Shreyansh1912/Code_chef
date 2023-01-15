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
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    
		    int d1 = (x1*x1) + (y1*y1);
		    int d2 = (x2*x2) + (y2*y2);
		    
		    if(d1 == d2) System.out.println("EQUAL");
		    else if(d1 > d2) System.out.println("ALEX");
		    else System.out.println("BOB");
		}
	}
}
