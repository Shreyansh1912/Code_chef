/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int len = sc.nextInt();
		    String s = sc.next();
		    
		    int zeroes=0, ones=0;
		    
		    for(int current=0; current<len; current++){
		        if(s.charAt(current) == '0'){
		            zeroes++;
		        } else{
		            ones++;
		        }
		    }
		    if(zeroes >= ones) System.out.println(ones);
		    else System.out.println(zeroes+1);
		    
		}
	}
}
