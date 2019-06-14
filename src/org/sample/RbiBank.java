package org.sample;

public class RbiBank extends IciciBank{

@Override
	public void deposit(int id) {
		System.out.println(id);
	}
public static void fixed() {
System.out.println("7%");
}
@Override
	public void savings() {
		System.out.println("13%");
	}
public static void main(String[] args) {
	RbiBank rb=new RbiBank();
	
	rb.savings();
	rb.deposit(15);
	fixed();
	
}
}