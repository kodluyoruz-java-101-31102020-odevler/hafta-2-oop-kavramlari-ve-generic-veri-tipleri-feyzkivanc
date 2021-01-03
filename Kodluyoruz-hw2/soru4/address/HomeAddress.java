package address;

public class HomeAddress implements Address {

	
	private String country;
	private String city;
	private String street;
	
	
	public HomeAddress(String country, String city, String street) {
		
		this.city= city;
		this.country=country;
		this.street= street;
		
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	
	

	@Override
	public String toString() {
		return "HomeAddress [country=" + country + ", city=" + city + ", street=" + street + "]";
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		}

}
