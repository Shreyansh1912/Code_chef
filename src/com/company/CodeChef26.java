package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef26
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=0;
            if(x!=a){
                c+=1;
            }
            if(x!=b){
                c=c+1;

            }
            if(y!=a){
                c+=1;
            }
            if(y!=b){
                c=c+1;

            }
            System.out.println(Math.abs(c-2));

        }

    }
}

