package concanationDemo;
import java.util.Scanner;

public class ConcatinationDemo {

	public static void main(String[] args) {
		System.out.println("My name is "+ Conmethod() );
		Scanner sc = new Scanner(System.in);
		System.out.println("input two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("the Sum of two numbers is " + Sum(a, b));
	}
	public static String Conmethod() {
		// TODO Auto-generated method stub
		String firstName = "Gaurab ";
		String lastName = "khatri";
		String fullName = firstName+lastName;
		return fullName;
		
	}
	public static int Sum(int b, int c) {
		return (b+c);
	}
}
