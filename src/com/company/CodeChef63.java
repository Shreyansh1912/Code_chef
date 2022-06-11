import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef63
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    if(n <= 6){
		        System.out.println(x);
		    }
		    if(n > 6){
		        if(n % 6 == 0){
		            System.out.println((n/6)*x);
		        }
		        else{
		            System.out.println(((n/6) + 1) * x);
		        }
		    }
		     
		}
	}
}
