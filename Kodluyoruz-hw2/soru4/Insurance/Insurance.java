package Insurance;

import java.util.Date;

public abstract class Insurance {
	
	protected String insuranceName;
	protected double insurancePrice;
	protected Date startInsurance;
	protected Date endInsurance;
	

	
	
	public  Insurance() {
		
	}
	
	
	
	public Insurance(String insuranceName, double insurancePrice, Date startInsurance, Date endInsurance) {
		
		this.endInsurance = endInsurance;
		this.insuranceName = insuranceName;
		this.insurancePrice =insurancePrice;
		this.startInsurance = startInsurance;
		
		
	}
	public abstract double calculate();

}
