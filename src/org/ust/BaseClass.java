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
		BaseClass bc=new BaseClass();
		bc.stringPalindromeByMadhavi();
		

	}

}
