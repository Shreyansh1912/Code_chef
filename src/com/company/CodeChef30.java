package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef30
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n<=m?n:2*n-m);
        }
    }
}