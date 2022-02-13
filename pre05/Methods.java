import java.io.*;
import java.util.*;


public class Methods{
	public static void main(String[] args){
    System.out.println(isDivisible(15,4));
		System.out.println(isTriangle(3,4,8));
		}

  public static boolean isDivisible(int n, int m) {
			return(n % m == 0);
		}
        
	
	public static boolean isTriangle(int a, int b, int c) {
	//I debated using a long or statement
		if (a + b <= c) {
			return false;
		}
		else if (b + c <= a) {
		return false;
		}
		else if (a + c <= b) {
			return false;
		}
		else {
		return true;
		}
	}
}