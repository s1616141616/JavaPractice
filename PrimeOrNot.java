package javabasic;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		scnr.close();
		
		System.out.println("Enter a number...");
		int input = scnr.nextInt();
		if (isPrime(input)) {
			System.out.println(input + " is a Prime Number.");
		} else {
			System.out.println(input + " is not a Prime ");
		}
	}

	public static boolean isPrime(int input) {
		if (input <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(input); i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
}