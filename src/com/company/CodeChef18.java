package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef18
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X<=1000 && Y<=1000){
                System.out.println((X*Y)/100);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
