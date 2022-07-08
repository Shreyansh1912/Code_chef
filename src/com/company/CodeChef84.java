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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int ts = a+b+c;
		    if(ts >= 100 && a >= 10 && b >= 10 && c >= 10){
		        System.out.println("PASS");
		    } else{
		        System.out.println("FAIL");
		    }
		}
	}
}
