
package Insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance
{

	public  ResidenceInsurance() {
	}
	public ResidenceInsurance(String insuranceName, Double insurancePrice, Date startInsurance, Date endInsurance  ) {

		super(insuranceName, insurancePrice, startInsurance, endInsurance);
		
		
		
		
	}
	@Override
	public double calculate() {
		
		
		double total = super.endInsurance.getTime() - super.startInsurance.getTime();
		return total*insurancePrice-40;
	}

}
