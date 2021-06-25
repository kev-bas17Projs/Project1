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

		int select;
		Scanner UserInput = new Scanner(System.in);
		select = UserInput.nextInt();

		boolean choice = true;

		while (choice == true) {
			switch (select) {
			case 1:
				//CupstoTeaspoons(num);
				double tsp = num * 48;
				System.out.println("Conversion from Cups to Teaspoons = " + tsp + " tsp");
				choice = false;
				break;

			case 2:
				//MilestoKiloMeters(num);
				double kilometers = num * 1.60934;
				System.out.println("Conversion from Miles to Kilometers = " + kilometers + " km");
				choice = false;
				break;

			case 3:
				//USGallonstoImperialGallons(num);
				double ig = num * 0.832674;
				System.out.println("Conversion from US Gallons to Imperial Gallons = " + ig + " Imperial Gallons");
				choice = false;
				break;

			case 4:
				System.out.println("Thank you, have a nice day.");
				System.exit(0);
				choice = false;
				break;
			}		
			UserInput.close();
		}
	}

	public static double CupstoTeaspoons(double qty) {
		// 1 cup is 48 teaspoons
		//double cup = 1;
		//double tsp = 48;
		double tsp = qty * 48;
		//double CtoTSP = qty * tsp;

		// 1 tsp is 0.020 cups
		//double TSPtoC = (qty / tsp);

		//return CtoTSP;
		return qty;
	}

	public static double USGallonstoImperialGallons(double qty) {
		// 1 USG = 0.832674 IG
		//double usg = 1;
		//double ig = 0.832674;
		double Ig = qty * 0.832674;
		//double USGtoIG = usg * ig;
		// 1 IG = 1.20095 USG

		//return USGtoIG;
		return qty;
	}

	public static double MilestoKiloMeters(double qty) {
		// 1 meter is 0.001 km
		//double m = 1;
		//double km = 1000;

		//double MtoKM = (m / km);
		// 1 km is 1000 meter
		double km = qty / 1000;
		//double KMtoM = km * m;
		return qty;
		//return MtoKM;
	}

}
