package designPatterns;

//import java.util.ArrayList;
import java.util.*;

interface Component{
	void showPrice();
}

class Leaf implements Component{
	
	int price;
	String name;
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+" : "+price);
	}
	
}

class Composite implements Component{
	
	String name;
	List <Component> components = new ArrayList<>();
	
	public void addComponent(Component cpm) {
		components.add(cpm);
	}
	
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		
	}
	
}