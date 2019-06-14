package org.thrd;
import java.util.Scanner;
public class Clock {
	
		private static Scanner s;
		public static void main(String[] args)
		{
			int a,b,c,d,angle=30;
			System.out.println("eneter the hour");
			s = new Scanner(System.in);
			a=s.nextInt();
			System.out.println("enter the minutes");
			b=s.nextInt();
			c=b/5;
			d=(c-a);
			c=d*30;
			System.out.println("the angle is"+d*30);
		}
	}

