package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            System.out.println((x-1)+" "+x+" "+(x+1));
        }
        // your code goes here
    }
}
