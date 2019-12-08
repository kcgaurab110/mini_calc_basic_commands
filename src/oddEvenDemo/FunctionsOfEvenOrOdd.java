package oddEvenDemo;

import java.util.Scanner;

public class FunctionsOfEvenOrOdd {
	public void inputNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number: ");
		int num = input.nextInt();
		evenOrOdd(num);
	}

	public void evenOrOdd(int num) {
		if (num % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
