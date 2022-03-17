package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
class CodeChef12
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan=new Scanner(System.in);
        int test=scan.nextInt();
        while(test!=0){
            int n=scan.nextInt();
            String s=scan.next();
            int c=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1')
                    c++;
            }
            int c1=(120-n)+c;
            double p=(c1/120.0)*100;
            if((p>=75.0))
                System.out.println("YES");
            else
                System.out.println("NO");
            test--;
        }
        scan.close();
    }
}
