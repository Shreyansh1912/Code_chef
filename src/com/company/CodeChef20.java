package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef20
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int res = N/3;
            N = N-res;
            System.out.println(N*X);
        }
    }
}
