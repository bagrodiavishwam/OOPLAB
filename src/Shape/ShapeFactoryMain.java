package Shape;

public class ShapeFactoryMain {
	public static void main(String [] args) {
		ShapeFactory sf=new ShapeFactory();
		Shape s=sf.getShape("Circle");
		s.draw();
	}
}
