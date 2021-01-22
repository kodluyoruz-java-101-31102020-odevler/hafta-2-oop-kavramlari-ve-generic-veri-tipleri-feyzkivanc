package Insurance;

import java.util.Date;

public class CarInsurance extends Insurance {

	
	
	
	
	
	public CarInsurance() {
		super();
	}

	public CarInsurance(String insuranceName, double insurancePrice, Date startInsurance, Date endInsurance) {
		super(insuranceName, insurancePrice, startInsurance, endInsurance);
	}

	@Override
	public double calculate() {
		double total = super.endInsurance.getTime()-super.startInsurance.getTime();
		
				return total*(insurancePrice*0.5);
	}

}
