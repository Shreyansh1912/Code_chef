/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int flag=0;
		    int x = sc.nextInt();
		    int[] arr = new int[2*x];
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    for(int i=0; i<2*x; i++){
		        arr[i] = sc.nextInt();
		        
		    if(map.containsKey(arr[i])){
		        map.put(arr[i], map.get(arr[i])+1);
		    } else{
		        map.put(arr[i],1);
		    }
		}
		for(Map.Entry<Integer,Integer> f:map.entrySet()){
		    if(f.getValue() > 2){
		        flag=1;
		        break;
		    }
		}
		
		if(flag == 1) System.out.println("No");
		else System.out.println("Yes");
		}
	}
}
