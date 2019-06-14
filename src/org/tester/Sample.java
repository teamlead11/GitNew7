package org.tester;

public class Sample {

	public static void main(String[] args) {
int a=123,i=0,sum=0;
while(a>0) {
	i=a%10;
	sum=sum+i;
	a=a/10;
}
System.out.println(sum);
	}

}
