package com.capgemini.lab2;

import java.util.Scanner;

public class Labexe3 { 
  
    static void getSorted(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
Scanner input = new Scanner(System.in);
System.out.println("enter number of elements");

int n= input.nextInt();

        int [] arr = new int[5]; 
        System.out.println("enter elements");
  for(int i=0;i<5;i++)
  {
arr[i] = input.nextInt();
  }
  for(int i: arr){

      System.out.println(i);
  }
        getSorted(arr, arr.length); 
  
} }