package org.bash;

public class GreensTech {
public GreensTech()
{
	System.out.println("Default Constructor called automatically while object is created");
}
private void Greens() {
System.out.println("Greens method is calling");
}
public GreensTech(int id)
{
	System.out.println("Int par constructor calling "+ id);
}
public GreensTech(String s) 
{         this();
	System.out.println("String par constructor calling "+ s);
}
public static void main(String[] args) {
	GreensTech g=new GreensTech();
	GreensTech g1=new GreensTech(10);
	GreensTech g2=new GreensTech("madhu");
	g1.Greens();
	
}
}
