package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef13
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int max=0;
            int N;
            int B;
            int W,H,P;
            N=sc.nextInt();
            B=sc.nextInt();
            for(int i=1;i<=N;i++)
            {
                W=sc.nextInt();
                H=sc.nextInt();
                P=sc.nextInt();
                if(P<=B)
                {
                    if(W*H>max)
                    {
                        max=W*H;
                    }
                }
            }
            if(max==0)
            {
                System.out.println("no tablet");
            }
            else
            {
                System.out.println(max);
            }

            t--;

        }
    }
}
