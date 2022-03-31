package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;
class CodeChef33
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t-->0){
            int sa = s.nextInt();
            int sb = s.nextInt();
            int sc = s.nextInt();
            if(sa<sb && sa<sc){
                System.out.println("Draw");
            }
            else if(sb<sa && sb<sc){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}
