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
		    
		    int z = x*3;
		    
		    if(z > y) 
		    {
		        System.out.println("No");
		    }
		    else if(z <= y) 
        {
          System.out.println("Yes");
        }
		    else System.out.println("No");
		}
	}
}
