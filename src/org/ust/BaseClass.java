package org.ust;

public class BaseClass {
	private void stringPalindromeByMadhavi() {
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
		System.out.println("Conflict class");
		BaseClass b=new BaseClass();
		b.stringPalindromeByMadhavi();
		

	}

}
