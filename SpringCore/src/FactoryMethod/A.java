package FactoryMethod;

public class A {
	public static A getA() {
		return new A();
	}
	
	void display() {
		System.out.println("display from A");
	}
}
