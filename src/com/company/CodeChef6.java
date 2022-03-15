package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef6
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try
        {

            Scanner sc=new Scanner(System.in);

            int t=sc.nextInt();


            while(t-->0)
            {
                int n=sc.nextInt();
                int ar[]=new int[n];

                int a;
                int i;

                for(i=0;i<n;i++)
                {
                    ar[i]=sc.nextInt();
                }

                a=0;
                int p=-1;
                i=1;
                while(i<n)
                {
                    if(ar[i]==ar[i-1])
                    {
                        p=-1;
                        i++;
                        continue;
                    }
                    a+=1;
                    if(p==-1)
                    {
                        a+=1;

                    }
                    p=1;
                    i++;
                }

                System.out.print(a);
                System.out.print("\n");

            }

        }
        catch(Exception ee)
        {

        }
    }
}
