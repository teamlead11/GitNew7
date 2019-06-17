package org.sample;

import java.util.Scanner;



public class BaseClass {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int i,j, flag=1;
		
    String str;
    
    System.out.println("Enter the String");
    
    str=sc.next();
    
    for(i=0,j=str.length()-1;i<j;i++,j--) 
    {
    
    	if(str.charAt(i)==str.charAt(j))
    	{
    
    	}
    	else 
    		flag =0;
    }
	
if (flag ==1)
    	System.out.println("String entered by you is Palindrome");
else
	  System.out.println("string entered by you is not Palindrom");
      System.out.println("Thank you for working with us");
      int a,b,c=10;
      int d=15;
      if (d==10) {
    	  System.out.println("number is high");
      }
      
      System.out.println("Base class is created");
		BaseClass base = new BaseClass();
		base.stringPalindromeByPradee();
	}

	private void stringPalindromeByPradee() {
		System.out.println("string palindrome methods is created");

	}

}
