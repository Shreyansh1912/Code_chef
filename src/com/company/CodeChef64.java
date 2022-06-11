import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef64
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int testt = sc.nextInt();
	  while(testt-->0){
	      int A = sc.nextInt();
	      int B = sc.nextInt();
	      if(A == B) System.out.println("YES");
	      int sub = (B-A)%3;
	      if(sub == 0 || sub == 1) System.out.println("YES");
	      else System.out.println("NO");
	  }
	}
}
