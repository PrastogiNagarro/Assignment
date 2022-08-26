package Assignment1;

import java.util.Scanner;

public class InputCheck {
	
	public static void check(String carModel, String carType, int carCost, String carInsuranceType) {
		
		System.out.println("Please enter the details of your car:");
		Scanner get = new Scanner(System.in);
		boolean a = true;
		while (a) {
			// taking input from the users
			System.out.print("Car Model: ");
			carModel = get.next();
			System.out.print("Car Type: ");
			carType = get.next();
			if (!(carType.equals("sedan") || carType.equals("suv") || carType.equals("hatchback"))) {
				System.out.println("Please enter the correct Car Type!");
				continue;
			}
			System.out.print("Car Cost: ");
			carCost = get.nextInt();
			if (carCost <= 0) {
				System.out.println("Price of a car should be greater than zero!");
				continue;
			}
			System.out.print("Insurance Type: ");
			carInsuranceType = get.next();	
			if (!(carInsuranceType.equals("basic") || carInsuranceType.equals("premium"))) {
				System.out.println("Please enter the correct Car Insurance Type!");
				continue;
			}
			CarInsurancePublisher.carModel=carModel;
			CarInsurancePublisher.carType=carType;
			CarInsurancePublisher.carCost=carCost;
			CarInsurancePublisher.carInsuranceType=carInsuranceType;
			a = false;
		}

	}
}
