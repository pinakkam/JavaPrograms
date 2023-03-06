package basicPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);

		// Swapping the number with the third variable.
//		int t;
//		t = a;
//		a = b;
//		b = t;

		// System.out.println("The value of a is:" + a);
		// System.out.println("The value of b is:" + b);

		// Swapping the number without using third variable.
		a = a + b; // 10+20=30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20
		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);
	}

}
