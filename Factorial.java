package org.interview.JavaProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			
		}
		System.out.println("the factorial for the number " + n+" is " +  fact);
	}

}
