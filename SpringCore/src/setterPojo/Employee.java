package setterPojo;

public class Employee {
	
	String name;
	int id;
	Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return "name : "+name+" id : " + id + ",Address : " + address;
	}
	
}
