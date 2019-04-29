package org.interview.JavaProgram;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		System.out.println("enter the number that needs to be printed");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, i = 0, j = 0;
		a = n;
		while (a > 0) {
			i = a %10;
			j = (j * 10) + i;
			a = a /10;
		}
		System.out.println("The entered number is "+ n);
		System.out.println("The reversed number is "+j);
	}

}
