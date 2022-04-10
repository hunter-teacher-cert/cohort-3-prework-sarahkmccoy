import java.io.*;
import java.util.*;

public class sieve{
	public static void main(String[] args) {
		//An array with a non-repeated max value.
		int a;
		System.out.println("Here is an array starting at zero, going up to a parameter, n:");
		System.out.println(Arrays.toString(makelist(20)));
		
		System.out.println("Here is which of those numbers are prime");
		System.out.println(Arrays.toString(sieve(20)));
		
	}
//populate an array with the numbers 0 to n
	public static int[] makelist(int n){
		
		int[]a = new int[n];
		for (int i=0; i<a.length; i++) {
			a[i]=i;
		}		
		return a;
	}
	
	public static boolean[] sieve(int n) 
    {   boolean[] r = new boolean[n];
				r[0]=false;  //0 and 1 are neither prime nor comp.
				r[1]=false;
        for (int i=2; i <r .length; i++) 
        {
            r[i]=true;//first set everything to true
        }
			//start at 2.  Check divisibility up until the squareroot of the value.
        for (int i=2; i < Math.sqrt(n); i++)
        {
             if(r[i]==true) 
             {
                for(int j=(i*i); j<n; j=j+i) 
                {
                   r[j]=false;
                }
             }
        }
        return r;
    }


		}
	
