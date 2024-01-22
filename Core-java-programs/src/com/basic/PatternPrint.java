package com.basic;

public class PatternPrint {
	
	public static void main(String args[])   
	{   
	//i for rows and j for columns      
	//row denotes the number of rows you want to print  
	int i=2, j, row=4;
	int k;
	//outer loop for rows  
	for(i=0; i<row; i++)   
	{   
	//inner loop for columns  
	for(j=1; j<i; j++)   
	{   
	//prints stars   
	System.out.print("* ");
//	System.out.print("* ");
//	System.out.print("* ");

	} 
	for(k=1; j<i; j++)   
	{   
	//prints stars   
	System.out.print("* ");
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
	}}}   
	  


