package com.company;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef37
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int total =0;
            if(n%4==0){
                total = n/4;
                System.out.println(total);
            }
            else{
                total =(n/4)+1;
                System.out.println(total);
            }
        }
    }
}

