package com.company;


import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef31
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[Math.min(k,n-1)]);

        }
    }
}
