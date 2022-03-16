package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef11
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int L = sc.nextInt();
            String str = sc.next();
            char c[] = str.toCharArray();
            Arrays.sort(c);
            System.out.println(new String(c));
        }
    }
}
