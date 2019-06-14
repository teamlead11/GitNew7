package org.bash;

public class SwapThree {
public static void main(String[] args) {
	int a=20,b=10;
	System.out.println("before swap");
	System.out.println(a);
	System.out.println(b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap");
	System.out.println(a);
	System.out.println(b);
}
}
