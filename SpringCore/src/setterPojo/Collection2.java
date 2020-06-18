package setterPojo;

import java.util.List;

public class Collection2 {
	String name;
	List<User> list;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setList(List<User> list) {
		this.list = list;
	}
	
	public String toString() {
		return "name : "+name+" Users : " + list;
	}
}
