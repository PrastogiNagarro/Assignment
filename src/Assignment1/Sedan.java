package Assignment1;

public class Sedan implements IinsuranceCalculator {

	@Override
	public double insuranceCalculator(String insuranceType, int carPrice) {
		if((insuranceType.toLowerCase()).equals("basic")) {
			return carPrice*0.08;
		}
		else if((insuranceType.toLowerCase()).equals("premium")){
			return ((carPrice*0.08)+(carPrice*0.08*0.2));
		}
		else {
			return -1;
		}
		
	}

}
