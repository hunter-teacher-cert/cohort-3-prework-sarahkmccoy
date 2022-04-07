import java.io.*;
import java.util.*;

public class Array{
	public static void main(String[] args) {
	    
		double[] a = {1.0,2.0,3.0,4.0};
		double n = 3;
		System.out.println("Here is an array:");
		System.out.println(Arrays.toString(a));
		System.out.println("Here is that array raised to the power " + n);
		powArray(a,n);
		System.out.println(Arrays.toString(a));
		
	}

	public static double[] powArray(double[] a, double n){
		for (int i = 0; i < a.length; i++) {
    	a[i] = Math.pow(a[i], n);
			}
			return a;
		}
	}

