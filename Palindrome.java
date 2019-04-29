package org.interview.JavaProgram;

import java.util.Scanner;

public class Palindrome {
	public static void main (String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		long n = sc.nextLong();
		long a, i=0,j=0;
		a=n;
		while (a>0) {
			i = a%10 ;
			j= (j*10)+i;
			a=a/10;
		System.out.println(j);
		}
	if(j==n) {
		System.out.println("Entered number is a Palindrome");
	}else {
		System.out.println("Entered number is not a palindrome");
	}
	}

}
