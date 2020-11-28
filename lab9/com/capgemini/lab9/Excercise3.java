package com.capgemini.lab9;

import java.util.Scanner;
import java.util.function.Predicate;

interface valid
{
	boolean authentication(String str1,String str2);
}
public class Excercise3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter username");
	String str1 = sc.next();
	System.out.println("Enter password");
	String str2 = sc.next();
	valid p=(x,y)->x.equals("shaifali") && y.equals("123");
	System.out.println("Result:"+p.authentication(str1, str2));

}
}
