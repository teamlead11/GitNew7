package org.pro;

public class ArmStrong {
public static void main(String[] args) {
	int n = 153,a,i,j=0;
	a=n;
	while(a>0) {
		i=a%10;
		
		j=j+(i*i*i);
		
	    a=a/10;
	}
	
	System.out.println(j);
	if (n==j)
	{
		System.out.println("arm");
	}
	else
	{
		System.out.println("not armstrong");
	}
}
}
