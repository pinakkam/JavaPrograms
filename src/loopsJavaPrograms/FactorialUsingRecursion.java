package loopsJavaPrograms;

import java.util.Scanner;

public class FactorialUsingRecursion {

	static int fact=1;
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number for Factorial");
		int num= s.nextInt();
		FactorialUsingRecursion ob= new FactorialUsingRecursion();
		ob.calculateFactorial(num);
		System.out.println("The Factorial of Number: "+num+" is = "+ fact );
		
	}
	
	void calculateFactorial(int num)
	{
		if(num>1)
			
		{
			fact= fact*num;
			calculateFactorial(num-1);
		}
		
	}

}
