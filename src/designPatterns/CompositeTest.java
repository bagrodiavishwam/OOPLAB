package designPatterns;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component hd = new Leaf(4000, "HDD");
		Component mouse = new Leaf (400, "Mouse");
		Component monitor = new Leaf(14000, "Monitor");
		Component ram = new Leaf (6000,"Ram");
		Component cpu = new Leaf (40500, "CPU");
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ram.showPrice();
	}
}

