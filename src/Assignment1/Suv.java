package Assignment1;

public class Suv implements IinsuranceCalculator{
	
	@Override
	public double insuranceCalculator(String insuranceType, int carPrice) {
		if((insuranceType.toLowerCase()).equals("basic")) {
			return carPrice*0.1;
		}
		else if((insuranceType.toLowerCase()).equals("premium")) {
			return ((carPrice*0.1)+(carPrice*0.1*0.2));
		}
		else {
			return -1;
		}
		
	}
}
