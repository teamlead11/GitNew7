package org.tester;

public class BaseClass {
	
	public void Arun() {
		String name = "Arun";
		String res = "";
		for (int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			res = res+ch;
			
		}
	if(res.equals(name)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	}
	

	public static void main(String[] args) {
BaseClass B=new BaseClass();
B.Arun();

	}

}
