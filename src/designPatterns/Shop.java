package designPatterns;
//Builder Design Pattern
public class Shop {
	public static void main(String [] args) {
		Phone p=new PhoneBuilder().setOs("iOS").setRam(16).getPhone();
		System.out.print(p);
	}
}
