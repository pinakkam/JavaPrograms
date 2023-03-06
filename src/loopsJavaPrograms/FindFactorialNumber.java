package loopsJavaPrograms;

import java.util.Scanner;

public class FindFactorialNumber {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number you want to see the Factorial");
		int num= s.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the number is "+num+" is: "+fact);
	}

}
