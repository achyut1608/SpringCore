package setterPojo;

import java.util.Map;

public class WithMap2 {
	String name;
	Map<String,User> map;
	public void setName(String name) {
		this.name = name;
	}
	public void setMap(Map<String, User> map) {
		this.map = map;
	}
	
	public String toString() {
		return "name : "+name + "Map : " + map;
 	}
}
