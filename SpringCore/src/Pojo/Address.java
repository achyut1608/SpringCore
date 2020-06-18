package Pojo;

public class Address {
	String city,state,country;
	
	Address(String city,String state,String country){
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String toString() {
		return "city : "+ city+",state : " + state + ",country : " + country;
	}
}
