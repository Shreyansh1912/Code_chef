import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		     int left = n - x;
		    int r = left / 4;
		   
		    
		    if(n < x) System.out.println("0");
		    
		    else
		    {
		        if(left < 4 && left > 0){
		           System.out.println("1");
		        } else{
		             if(left % 4 == 0){
		               System.out.println(r);
		        } else{
		            System.out.println(r + 1);
		        }
		      }
		    }
		}
	}
}
