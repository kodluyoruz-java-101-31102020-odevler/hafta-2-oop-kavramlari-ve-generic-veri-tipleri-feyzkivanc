package Insurance;

import java.util.Date;

public  class HealthInsurance extends Insurance{

	
	
	
	
	
	public HealthInsurance() {
		super();
	}

	public HealthInsurance(String insuranceName, double insurancePrice, Date startInsurance, Date endInsurance) {
		super(insuranceName, insurancePrice, startInsurance, endInsurance);
	}

	@Override
	public double calculate() {
		double total = super.endInsurance.getTime()-super.startInsurance.getTime();
				
				
				return total*(insurancePrice*0.3)-30 ;
	}

}
