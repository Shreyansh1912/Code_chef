package com.company;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class CodeChef4 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int d1=Math.abs(x1-x2);
            int d2=Math.abs(y1-y2);
            System.out.println(Math.max(d1,d2));
        }
    }
}

