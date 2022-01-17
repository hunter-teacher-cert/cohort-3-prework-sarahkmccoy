import java.io.*;
import java.util.*;

public class Time{
    public static void main(String[] args){
        System.out.println("Hello world!");

				int hour = 10;
				int minute = 48;
				int second = 45;
				int sincemidnight = hour*60*60 + minute*60 + second;
				System.out.println("It has been " + sincemidnight + " seconds since midnight.");
    }
}
    