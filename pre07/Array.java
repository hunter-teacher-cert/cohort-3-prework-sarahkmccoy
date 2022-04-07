import java.io.*;
import java.util.*;

public class Array{
	public static void main(String[] args) {
	    
		double[] a = {1.0,2.0,3.0,4.0};
		System.out.println(Arrays.toString(a));
		powArray(a);
		System.out.println(Arrays.toString(a));
		
	}

	public static double[] powArray(double[] a){
		for (int i = 0; i < a.length; i++) {
    	a[i] = Math.pow(a[i], 2.0);
			}
			return a;
		}
	}

