package Pojo;

public class Student {
	private String name;
	private int id;
	
	public Student() {
	}
	
	public Student(int id,String name){
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString(){
		return "Hello : "+name+" id : " + id;
	}
	
}
