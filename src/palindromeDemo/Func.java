package palindromeDemo;
import java.util.Scanner;
public class Func{


	public void palind() {
		// TODO Auto-generated method stub
		int rem, rev = 0, temp;
		Scanner inp = new Scanner(System.in);
		System.out.println("Input the number: ");
		int n = inp.nextInt();

		temp = n;

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		if (temp == rev)
			System.out.println(temp + " is a palindrome.");
		else
			System.out.println(temp + " is not a palindrome.");

	}
}