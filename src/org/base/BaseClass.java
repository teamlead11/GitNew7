package org.base;

public class BaseClass {
	public void stringPalindromePraveena() {
		System.out.println("this is my paliindrome program");
	}
	public static void main(String[] args) {
		String rev="";
		String s="mom";
		for(int i=s.length()-1;i>0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
	}

}
