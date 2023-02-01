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
		    int z = sc.nextInt();
		    
		    
		    if(x < y && x < z) System.out.println("ALICE");
		    else if(y < x && y < z) System.out.println("BOB");
		    else System.out.println("CHARLIE");
		}
	}
}
