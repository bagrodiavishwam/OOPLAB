package lab4;

public class D extends B {
	public void speak() {
		System.out.println("This is speak for D");
	}
	public void sum() {
		System.out.println("This is sum for D");
	}
	public static void main(String [] args) {
		A ob=new D();
		ob.speak();
		ob.compute();
//		ob.sum();
		
	}
}
