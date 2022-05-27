import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef56
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t != 0){
		     int x = sc.nextInt();
		     int y = sc.nextInt();
		     int z = sc.nextInt();
		     
		     int p = x - y;
		     
		     System.out.println(p*z);
		     t--;
		 }
	}
}
