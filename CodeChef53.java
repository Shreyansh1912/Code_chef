import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef53
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int t =sc.nextInt();
	  while(t-->0){
	      int n=sc.nextInt();
	      int arr[] = new int[4];
	      for(int i=0;i<4;i++){
	          arr[i]=sc.nextInt();
	      }
	      Arrays.sort(arr);
	      System.out.println(arr[3]);
	  }
	}
}
