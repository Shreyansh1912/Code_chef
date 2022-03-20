package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef21
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int x= sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x+y==z || x+z==y || y+z==x)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
