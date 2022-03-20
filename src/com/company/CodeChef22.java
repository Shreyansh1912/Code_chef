package com.company;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

class CodeChef22 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        long sum=0;
        int a[]=new int[n];
        long b[]=new long[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextLong();

        while(q-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            for(int j=l-1;j<r;j++)
                sum=sum+(a[j]*b[j]);
            System.out.println(sum);
            sum=0;
        }
        sc.close();
    }
}