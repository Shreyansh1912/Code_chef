/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef55
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner (System.in);
		int tt=sc.nextInt();
		for(int ii=0;ii<tt;ii++)
		{
		    int n=sc.nextInt();
        int arr[]=new int[32];
        for(int i=0;i<n;i++)
        {
         int j=0;
         int a=sc.nextInt();
         while(a!=0)
         { 
         if(arr[j]==0)
         arr[j]=a%2;
         a/=2;
         j++;
         }
          }
         int res=0;
         for(int i=0;i<32;i++)
         {
           res=res+arr[i];
          }

       System.out.println(res);
		}
	}
}
