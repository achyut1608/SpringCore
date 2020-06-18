package autowiring;

public class A {
	B b3,b4;

	A(B b3 ,B b4){System.out.println("in Constructor Of A");
		this.b3 =b3;
		this.b4 = b4;
	}
	
	public B getB3() {
		return b3;
	}

	public void setB3(B b3) {
		this.b3 = b3;
	}
	
	public B getB4() {
		return b4;
	}

	public void setB4(B b4) {
		this.b4 = b4;
	}

	void print() {
		System.out.println("in print method of A");
	}
	
	void display() {
		print();
		b3.print();
		b4.print();
	}
	
	
}
