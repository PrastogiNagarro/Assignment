package Assignment1;

public class Hatchback implements IinsuranceCalculator{
	
	@Override
	public double insuranceCalculator(String insuranceType, int carPrice) {
		
		if((insuranceType.toLowerCase()).equals("basic")) {
			return carPrice*0.05;
		}
		else if((insuranceType.toLowerCase()).equals("premium")){
			return ((carPrice*0.05)+(carPrice*0.05*0.2));
		}
		else {
			return -1;
		}
		
	}

}
