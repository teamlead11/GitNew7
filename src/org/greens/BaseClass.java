package org.greens;

public class BaseClass {
	private void stringPalindromeByMadhavilatha() {
		String s="madhavilatha";
		String res="";
		for(int i=(s.length()-1);i>=0;i--) {
			res=res+s.charAt(i);
			}
		System.out.println(res);
		if(res.equals(s)) {
			System.out.println("palindrome String");
		}
		else
		{
			System.out.println("Not a palindrome String");
		}
	}
	public static void main(String[] args) {
		System.out.println("Project class Day3 Task");
		BaseClass b=new BaseClass();
		b.stringPalindromeByMadhavilatha();
		System.out.println("done");
		b.stringpalindromebypradee();
		
	}
	 private void stringpalindromebypradee() {
		System.out.println("added one method ");

		System.out.println("change 12.18pm");
	}

	
}
