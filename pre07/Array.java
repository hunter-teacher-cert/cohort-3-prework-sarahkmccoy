import java.io.*;
import java.util.*;

public class Array{
	public static void main(String[] args) {
	  //Calling powArray with a list of the numbers 1 to 4, using the power 3.
		double[] a = {1.0,2.0,3.0,4.0};
		double n = 3;
		System.out.println("Here is an array:");
		System.out.println(Arrays.toString(a));
		System.out.println("Here is that array raised to the power " + n);
		powArray(a,n);
		System.out.println(Arrays.toString(a));
		
		//Calling histogram with  numcounters counters and array of numscores random values.  I can't get it to work for fewer than 100 counters.  Getting an index out of bounds error code.  I'm not tracking how its working.
		int numcounters = 100;
		int[] class_scores = randomArray(100);
		System.out.println("Here is an array of 100 random scores");
		System.out.println(Arrays.toString(class_scores));
		System.out.println("Here is a histogram of those scores, using 100 counters");
		System.out.println(Arrays.toString(histogram(class_scores, numcounters)));
	}
//powArray
	public static double[] powArray(double[] a, double n){
		for (int i = 0; i < a.length; i++) {
    	a[i] = Math.pow(a[i], n);
			}
			return a;
		}

//Create a random array of integers
	public static int[] randomArray(int size){
		Random random = new Random();
		int[]a = new int[size];
		for (int i=0; i <a.length; i++) {
			a[i]=random.nextInt(101);
		}
			return a;
		}
//Histogram 
	public static int[] histogram(int[] scores,int counters){
		int[] counts = new int[counters];
		for (int score : scores){
    	counts[score]++;
		}
		return counts;
	}
}

