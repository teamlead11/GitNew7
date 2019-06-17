package testpack;

public class BaseClass {
	
	public static void main(String[] args) {
		String name = "Ramadevi";
		String res = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			res = res + ch;
		}
		if (res.equals(name)) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("Not palindrome string");
		}

	}

}
