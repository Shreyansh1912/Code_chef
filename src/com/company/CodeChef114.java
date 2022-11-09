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
		    int[] arr = new int[x];
		    
		    for(int i=0; i<x; i++){
		        arr[i] = sc.nextInt();
		    }
		    int max = Integer.MIN_VALUE;
		    for(int i=0; i<x; i++){
		        if(arr[i] > max){
		            max = arr[i];
		        }
		    }
		    System.out.println(max);
		}
	}
}
