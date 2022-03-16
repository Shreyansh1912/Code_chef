package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef10
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            int res = K/X;
            if(res>N){
                System.out.println(N);
            }
            else{
                System.out.println(res);
            }

        }
    }
}
