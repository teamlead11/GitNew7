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
	

<<<<<<< HEAD
		public void PalindromePraneetha() {
			String name = "praneetha";
			String res = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				char ch = name.charAt(i);
				res = res + ch;
			}
			if (res.equals(name)) {
				System.out.println("Palindrome string");
			} 
			else {
				System.out.println("Not palindrome string");
	}
		}	
		public static void main(String[] args) {
			BaseClass b=new BaseClass();
			b.PalindromePraneetha();
			
=======
	public static void main(String[] args) {
BaseClass B=new BaseClass();
B.Arun();

>>>>>>> 02c3d9e3c4924e1f3f98d4cc9ad0cc0b6d4d680a
	}

}
