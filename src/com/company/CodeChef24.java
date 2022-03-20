package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef24
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s1 = new Scanner(System.in);
        int t = s1.nextInt();
        while(t-->0){
            int a1 = s1.nextInt();
            int a2 = s1.nextInt();
            int a3 = s1.nextInt();
            int a4 = s1.nextInt();
            int a5 = s1.nextInt();
            int p = s1.nextInt();
            a1*=p;
            a2*=p;
            a3*=p;
            a4*=p;
            a5*=p;
            if(a1+a2+a3+a4+a5>120){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
