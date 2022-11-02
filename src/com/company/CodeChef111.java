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
		    
		    if(z >= y) System.out.println(x);
		    else{
		        if(y % z == 0){
		            System.out.println(x*(y/z));
		        }else{
		            System.out.println(x*(y/z+1));
		        }
		    }
		}
	}
}
