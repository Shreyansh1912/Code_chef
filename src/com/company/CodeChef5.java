package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class CodeChef5 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int X=sc.nextInt();
            int P=sc.nextInt();
            if((X*3)-(N-X)>=P){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }
}
