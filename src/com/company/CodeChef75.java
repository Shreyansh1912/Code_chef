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
		    	int s = sc.nextInt();
		    	int a = s/100;
		    	int b = s%100;
		    	if((a+b)<=10) System.out.println(a+b);
		    	else System.out.println("-1");
		    	
		}
	}
}
