package designPatterns;

import java.util.List;

interface Component{
	void showPrice();
}

class Leaf implements Component{
	
	int price;
	String name;
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		
	}
	
}

class Composite implements Component{
	
	List <Component> components;
	
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		
	}
	
}