import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
            String st = sc.next();
		    char[] ch = st.toCharArray();
		    int one=0, zero=0;
		    
		    for(int i=0; i<ch.length; i++){
		        if(ch[i] == '1') 
		          one++;
		        else 
		           zero++;
		    }
		    if(n%2 == 0){
		        if(one%2 == 0 && zero%2 == 0)
		           System.out.println("YES");
		        else 
		           System.out.println("NO");
		    } else{
		        System.out.println("YES");
		    }
		}
	}
}
