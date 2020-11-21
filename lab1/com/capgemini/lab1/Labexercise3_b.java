package com.capgemini.lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Labexercise3_b {
	int fib(int n) {
		if(n==1)
			return (1);
		else if(n==2)
			return (1);
		else
			return (fib(n-1)+fib(n-2));
	}
}
class RecFibDemo {
	public static void main(String args[])throws IOException {
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("enter number");
		int n=Integer.parseInt(br.readLine());
		Labexercise3_b ob=new Labexercise3_b();
		System.out.println("fibonaccies is as follows");
		int res=0;
		for(int i=1;i<=n;i++) {
			res=ob.fib(i);
			System.out.println(" "+res);
		}
		System.out.println();
		System.out.println(n+"the of the series is "+res);
	}
}
