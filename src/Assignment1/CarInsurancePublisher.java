package Assignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class CarInsurancePublisher {
	static String carModel ="";
	static String carType ="";
	static int carCost =0;
	static String carInsuranceType ="";
	public static void main(String[] args) {
		
		Scanner get=new Scanner(System.in);
		String ans;
		ArrayList<Double> list=new ArrayList<>();
		do{
			InputCheck.check(carModel,carType,carCost,carInsuranceType);
		
			IinsuranceCalculator car;
			if((carType.toLowerCase()).equals("hatchback")) {
				car=new Hatchback();
				list.add(car.insuranceCalculator(carInsuranceType, carCost));
		
			}
			else if((carType.toLowerCase()).equals("sedan")) {
				car=new Sedan();
				list.add(car.insuranceCalculator(carInsuranceType, carCost));
			}
			else if((carType.toLowerCase()).equals("suv")){
				car=new Suv();
				list.add(car.insuranceCalculator(carInsuranceType, carCost));
			}
				
			System.out.print("Do you want to enter the details of another Car? (y/n) ");	
			ans=get.next();
		}while(ans.equals("y"));
		for(int i=0;i<list.size();i++) {
			System.out.println("Car "+(i+1)+" = " + list.get(i));
		}
	}
	
}
