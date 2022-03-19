package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef19
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int count=0;
            int X = sc.nextInt();
            if(X%5!=0 && X%10!=0){
                System.out.println("-1");
            }
            else{
                int ans=0;
                ans+=X/10;
                int v=X%10;
                ans=ans+v/5;
                System.out.println(ans);
            }
        }
    }
}

