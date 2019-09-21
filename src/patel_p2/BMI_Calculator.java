package patel_p2;

import java.util.Scanner;
public class BMI_Calculator {

	public static void main(String[] args) {
		double BMI;
		double weight, height;
		int choice;
		String category[];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which measurement would you like to use to measure your BMI? (1=Metric  2=Imperial)");
		choice = input.nextInt();
		
		if(choice == 1) {
			
			System.out.print("Enter your weight in kilograms: ");
			weight = input.nextInt();
			System.out.print("Enter your height in meters squared: ");
			height = input.nextInt();
			
			BMI = weight / height;
			
			System.out.println("Your BMI is: " + BMI);
			
			if(BMI < 18.5) {
				System.out.println("You are classified: Underweight");
			}
			else if(BMI >= 18.5 && BMI <= 24.9) {
				System.out.println("You are classifed: Normal Weight");
			}
			else if(BMI >= 25 && BMI <= 29.9) {
				System.out.println("You are classified: Overweight");
			}
			else if(BMI >= 30) {
				System.out.println("You are classifed: Obesity");
			}
		}
		else if(choice == 2) {
			
			System.out.print("Enter your weight in pounds: ");
			weight = input.nextInt();
			System.out.print("Enter your height in inches squared: ");
			height = input.nextInt();
			
			BMI = (703*weight)/height;
			
			System.out.println("Your BMI is: " + BMI);
			
			if(BMI < 18.5) {
				System.out.println("You are classified: Underweight");
			}
			else if(BMI >= 18.5 && BMI <= 24.9) {
				System.out.println("You are classifed: Normal Weight");
			}
			else if(BMI >= 25 && BMI <= 29.9) {
				System.out.println("You are classified: Overweight");
			}
			else if(BMI >= 30) {
				System.out.println("You are classifed: Obesity");
			}
		}

	}

}
