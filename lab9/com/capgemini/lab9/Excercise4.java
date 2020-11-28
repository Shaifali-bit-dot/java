package com.capgemini.lab9;

interface Student
{
	Person get(String name);
}

class Person {
    private String name;
    
   Person()
    {
        System.out.println("Empty");
    }
    Person(String name) 
    {
         this.name = name;
    }
    
    public String toString() {
        return "name: " + name;
    }
}
  

public class Excercise4 {
	
	public static void main(String[] args) 

{ 
		Student stu = Person::new ;
	    System.out.println(stu.get("shaifali"));
	 
}
}