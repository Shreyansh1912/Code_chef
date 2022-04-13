package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef44
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int [n];
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<n-1;i++){
                sum=sum+arr[i];
            }
            int y=(x*n)-sum;
            if(y<0){
                System.out.println(0);
            }
            else{
                System.out.println(y);
            }
        }
    }
}
