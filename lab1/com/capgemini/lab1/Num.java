package com.capgemini.lab1;
class Num
{
/* Function to check if x is power of 2*/
static boolean checkNumber(int n)
{
    if(n==0)
    return false;
 
return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
}
 
// Driver Code
public static void main(String[] args)
{
    if(checkNumber(8))
    System.out.println("Yes");
    else
    System.out.println("No");
     
    if(checkNumber(5))
    System.out.println("Yes");
    else
    System.out.println("No");
}
}
 