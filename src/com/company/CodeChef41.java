package com.company;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef41
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int P=sc.nextInt();
            int Q =sc.nextInt();
            int R = Q/P;
            int S = Q%P;

            if(S==0) System.out.println(R-1);
            else System.out.println(R);

        }

    }
}

