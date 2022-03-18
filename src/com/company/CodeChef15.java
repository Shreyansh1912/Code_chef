package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef15
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        String temp=scan.nextLine();
        for(int z=0;z<t;z++)
        {
            String s=scan.nextLine();
            int c=0;
            for(int i=1;i<s.length();i++)
            {
                if((s.charAt(i)=='x' && s.charAt(i+1)=='y') || (s.charAt(i)=='y' && s.charAt(i+1)=='x'))
                {
                    c++;
                    i++;
                }
            }
            System.out.println(c);
        }
    }
}

