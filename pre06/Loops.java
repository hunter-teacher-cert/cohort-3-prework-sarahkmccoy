import java.io.*;
import java.util.*;

public class Loops{
	public static void main(String[] args) {
	    //Call the methods defined below
			System.out.println(squareRoot(100));
				}
		
  //7.9 #2
  public static double squareRoot(double a) {
	 double guess1 = a/2;
	 double guess2 =(guess1 + a/guess1)/2;

	 while (Math.abs(guess1 - guess2) >= 0.0001){
		 guess1 = guess2;
		 guess2 = (guess1 + a/guess1)/2;
		
		}
		return guess2;
 }

	
		
	}