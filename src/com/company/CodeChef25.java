package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef25
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int R=scan.nextInt(),N=0,Y=0,I=0;
            String S=scan.next();
            for(int i=0;i<R;i++){
                if(S.charAt(i)=='N')
                    N++;
                else if(S.charAt(i)=='Y')
                    Y++;
                else
                    I++;
            }
            if(I!=0){
                System.out.println("INDIAN");
            }
            else{
                if(Y!=0)
                    System.out.println("NOT INDIAN");
                else
                    System.out.println("NOT SURE");
            }
        }
    }
}
