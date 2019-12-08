package miniCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String af;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("input any two numbers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("**********menu*************");
			System.out.println("1.Add\n2.Sub\n3.Multiply\n4.Division");

			System.out.println("Select any key for actions:\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sum(a, b);
				break;
			case 2:
				sub(a, b);
				break;
			case 3:
				multiply(a, b);
				break;
			case 4:
				divide(a, b);
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			System.out.println("Do you want to continue ? y/n");
			af = sc.next().toUpperCase();
		} while (af.equalsIgnoreCase("Y"));// it is similar to equals() but it ignores case.

	}

	private static void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the division of two numbers is " + (a / b));
	}

	private static void multiply(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the multiply of two numbeRr is " + (a * b));
	}

	private static void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the Sub of two numbers is " + (a - b));
	}

	private static void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the Sum of two numbers is " + (a + b));
	}

}
