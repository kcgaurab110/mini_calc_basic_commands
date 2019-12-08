package arrayDemo;

public class EvenOrOddInArray {

	public static void main(String[] args) {
		System.out.println(array());
	}

	private static boolean array() {
		// TODO Auto-generated method stub
		
		int[] myList = { 1, 2, 3, 5 };
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] % 2 == 0) {
				return true;
			}
		}
		return false;
	}
	
}
