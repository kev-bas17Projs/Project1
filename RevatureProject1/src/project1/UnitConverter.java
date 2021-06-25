package project1;

import java.util.Scanner;

public class UnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner typing = new Scanner(System.in);
		double num;
		System.out.println("Hello and Welcome to the Unit Converter. Please enter your number unit: ");
		num = typing.nextInt();

		System.out.println("Here are your conversion options: ");
		System.out.println("1: Cups to Teaspoons");
		System.out.println("2: Miles to Kilometers");
		System.out.println("3: US Gallons to Imperial Gallons");
		System.out.println("4: Quit");

		boolean choice = true;

		int repeat = 0;

		while (choice) {
			int select;
			Scanner UserInput = new Scanner(System.in);
			select = UserInput.nextInt();

			switch (select) {
			case 1:
				double tsp = num * 48;
				System.out.println("Conversion from Cups to Teaspoons = " + tsp + " tsp");
				break;

			case 2:
				double kilometers = num * 1.60934;
				System.out.println("Conversion from Miles to Kilometers = " + kilometers + " km");
				break;

			case 3:
				double ig = num * 0.832674;
				System.out.println("Conversion from US Gallons to Imperial Gallons = " + ig + " Imperial Gallons");
				break;

			case 4:
				System.out.println("Thank you, have a nice day.");
				System.exit(0);
				choice = false;
				break;
			}
		}

	}
}
