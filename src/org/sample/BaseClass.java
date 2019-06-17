package org.sample;

public class BaseClass {
	public void stringPalindromeSirisha(){
		System.out.println("This is My Palindrome");
		System.out.println("added code");
		
	}
public static void main(String[] args) {
	String rev="";
	String s="DAD";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		
	}
	if(s.equals(rev)) {
		System.out.println("String Is  a Palindrome");
	}
	else {
		System.out.println("String Is Not a Palindrome");
	}
}
}
