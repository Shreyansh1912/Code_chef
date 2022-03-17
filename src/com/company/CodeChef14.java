package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef14
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long mod = arr[0] % arr[1];
            for(int i=2 ;i<n;i++){
                int val = arr[i];
                mod = (mod%val);
            }

            System.out.println(mod);
        }  /*Test case ends here*/


    }
}
