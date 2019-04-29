package org.interview.JavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a = n, i = 0, j = 0;
		while (a > 0) {
			i = a % 10;

			j = (i * i * i) + j;
			a = a / 10;

		}
		if (j == n) {
			System.out.println("The entered number is an Armstrong number");
		} else {
			System.out.println("The entered number is not an Armstrong numbera");
		}
	}
}