package primeOrNot;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	    Scanner input =  new Scanner(System.in);

	    int number, i, a = 0;

	    System.out.println("Enter a number: ");
	    number = input.nextInt();

	    for (i = 1; i < (number + 1); i++) {
	        if (number % i == 0) {
	            a++;
	        }
	    }

	    System.out.println(prime(a));
	}

	public static boolean prime(int a) {
	    if (a != 2) {
	        return false;
	    }

	    return true;
	}

	}
