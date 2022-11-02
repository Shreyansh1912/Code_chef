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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int c = 2*x;
		    int ca = 5*y;
		    
		    if(c > ca) System.out.println("Chocolate");
		    else if(c == ca) System.out.println("Either");
		    else System.out.println("Candy");
		}
	}
}
