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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		   
		   System.out.println(isPrime(x+y) ? "Alice":"Bob");
		}
	}
	static boolean isPrime(int n)
    {
        if (n <= 1) return false;
    
        else if (n == 2) return true;
    
        else if (n % 2 == 0) return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    
    }
}
