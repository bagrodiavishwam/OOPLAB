package com.phone;
//Factory Design Pattern
public class OSFactory {
	public OS getInstance(String str) {
		if(str.equalsIgnoreCase("Open"))
			return new Android();
		
		else if(str.equalsIgnoreCase("Secure"))
			return new IOS();
		
		else
			return new WindowsOS();
		}
	}

