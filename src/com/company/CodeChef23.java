package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef23
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int S = sc.nextInt();

            for(int i=0;i<S;i++)
            {
                int A = sc.nextInt();
                int B = sc.nextInt();

                if(A==X)
                    X = B;
                else if(B==X)
                    X = A;
            }
            System.out.println(X);
        }
    }
}
