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
    	System.out.println("String is Palindrome");
else
	  System.out.println("string is not Palindrom");
}
}
