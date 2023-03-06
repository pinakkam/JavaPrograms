package basicPrograms;

public class FindLargerNumber {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		// For two numbers
//		if (num1 > num2) {
//			System.out.println("Number1 is greater than number 2");
//
//		} else {
//			System.out.println("Number 2 is greater than number 1");
//		}
		// For Three Numbers
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is the greater number thn num 2 and num3");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is the greater number thn num 1 and num3");
		} else {
			System.out.println("num3 is the greater number thn num 1 and num2");
		}
	}

}
