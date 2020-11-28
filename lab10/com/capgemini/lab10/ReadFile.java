package com.capgemini.lab10;
import java.io.*;

import java.util.*;

public class ReadFile {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	        System.out.print("Enter the name of the file: ");

	        String file_name = input.nextLine();

	        File f = new File(file_name);

	        int i;

	        boolean wrong=true;

	        while(wrong)

	        {

	try{

	FileReader finp = new FileReader(f);

	                LineNumberReader linereader = new LineNumberReader(finp);

	                while((i=linereader.read())!=-1)

	{

	System.out.println("Line #:"+(linereader.getLineNumber()+1));

	                    System.out.println((char)i+linereader.readLine());

	                }

	wrong=false;

	            }

	            catch(FileNotFoundException e){

	System.out.println("File does not exist, ");

	                System.out.print("Enter another file name:");

	                file_name = input.nextLine();

	                f = new File(file_name);

	            }

	            catch(IOException e){

	System.out.println("Cannot Read file:");

	            }

	        }

	    }

	}


