package designPatterns;
//Builder Design Pattern
public class PhoneBuilder {
	private String os;
	private int ram;
	private double screenSize;
	private String processor;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os=os;
		return this;
	}
	
	public PhoneBuilder setRam( int ram) {
		this.ram=ram;
		return this;
	}
	
	public PhoneBuilder setScreenSize(double screensize) {
		this.screenSize=screensize;
		return this;
	}
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor=processor;
		return this;
	}
	
	public PhoneBuilder setBattery(int battery) {
		this.battery=battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, ram, processor, screenSize, battery);
		}
}
