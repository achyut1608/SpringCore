package setterPojo;

public class User {
	String name,email;
	int id;
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "id : "+id+",name : " + name + ",email : " + email;
 	}
}
