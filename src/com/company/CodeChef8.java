package com.company;

import java.util.*;
import java.lang.*;
class CodeChef8
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int M = sc.nextInt();
            int H = sc.nextInt();
            int BMI = M/(H*H);
            if(BMI<=18){
                System.out.println("1");
            }
            else if(BMI>=19 && BMI<=24){
                System.out.println("2");
            }
            else if(BMI>=25 && BMI<=29){
                System.out.println("3");
            }
            else{
                System.out.println("4");
            }
        }
    }
}
