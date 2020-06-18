package setterPojo;

public class Address {
	String city,state,country;
	
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return " city : "+ city + ",State : " + state + ", country : " + country;
	}
}
