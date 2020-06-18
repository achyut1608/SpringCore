package Pojo;

public class Employee {
	String name;
	int id;
	Address address;
	
	public Employee(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	public Employee(String name,int id,Address address){
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public String toString() {
		return "name : "+name+",id : "+ id+",Address : "+address;
	}
}
