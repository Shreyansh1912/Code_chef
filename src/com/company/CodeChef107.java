import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);// your code goes here
		int t = sc.nextInt();
		while(t-->0){
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println((x%y)+(x/y));
		}
	}
}
