package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef16
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min_diff=Integer.MAX_VALUE;
            for(int i=1; i<n; i++){
                min_diff=Math.min(min_diff, arr[i]-arr[i-1]);
            }

            System.out.println(min_diff);
        }

    }
}

