package address;

public class BusinessAddress implements Address {

	
	
	private String city;
	private String country;
	private int postCode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public  BusinessAddress(String city, String country, int postCode) {
		
		
		this.city= "Ankara";
		this.country="Turkiye";
	    this.postCode = 26680;
		
		
		
	}
	
	
	 @Override
	public String toString() {
		return "BusinessAddress [city=" + city + ", country=" + country + ", postCode=" + postCode + "]";
	}
	public BusinessAddress() {
	}
	@Override
	public void showInfo() {
		
	}

}
