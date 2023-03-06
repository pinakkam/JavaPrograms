package basicPrograms;

public class CheckLeapYear {

	public static void main(String[] args) {

		int year = 2020;
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

			System.out.println("Year is a leap Year");
		} else {
			System.out.println("Year is not a leap Year");
		}
	}

}
