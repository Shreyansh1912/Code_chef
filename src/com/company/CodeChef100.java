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
		    
		    if(x%25 == 0){
		        System.out.println(x/25);
		    }
		    else{
		        System.out.println((x/25)+1);
		    }
		}
	}
}
