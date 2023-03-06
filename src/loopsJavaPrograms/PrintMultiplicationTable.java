package loopsJavaPrograms;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number which you want to println the nultiplication table");
		int t= s.nextInt();

			System.out.println("The multiplication table you want to see is:" + t);
			for(int i=1; i<=10; i++)
			{
				System.out.println("The table of:"+t+" is "+t+"*"+i+"="+t*i);
			}
	}

}
