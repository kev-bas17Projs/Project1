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
		
		//Loop 
		while(select == 1) {
			
		} 
		
		if(select == 2) {
			
		}
		
		else if(select == 3) {
			
		}
		
		else if(select == 4) {
			
		}
		
		
	}
	
	public double CupstoTeaspoons(double qty) {
		// 1 cup is 48 teaspoons
		double cup = 1;
		double tsp = 48;
		
		double CtoTSP = cup * tsp; 
		
		// 1 tsp is 0.020 cups
		double TSPtoC = (cup / tsp);
		
		return CtoTSP;
	}
	
	public double USGallonstoImperialGallons(double qty) {
		// 1 USG = 0.832674 IG
		double usg = 1;
		double ig = 0.832674;
		
		double USGtoIG = usg * ig;
		// 1 IG = 1.20095 USG
		
		return USGtoIG;
	}
	
	public double MilestoKiloMeters(double qty) {
		// 1 meter is 0.001 km
		double m  = 1;
		double km = 1000;
		
		double MtoKM = (m/km);
		// 1 km is 1000 meter
		
		double KMtoM = km * m;
		
		return MtoKM;
	}
	

}
