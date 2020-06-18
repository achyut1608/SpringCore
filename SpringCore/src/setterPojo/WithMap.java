package setterPojo;

import java.util.HashMap;
import java.util.Map;

public class WithMap {
	String name;
	Map<String,String> map = new HashMap<>();
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public String toString() {
		return "name : "+ name + "Map : " + map;
	}
	
}
