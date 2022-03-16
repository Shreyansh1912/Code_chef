package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef9
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int C = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println((C*Y)-(X*Y));
        }
    }
}
