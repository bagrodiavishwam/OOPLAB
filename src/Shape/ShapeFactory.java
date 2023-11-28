package Shape;

public class ShapeFactory {
	public Shape getShape(String str) {
		if(str.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(str.equalsIgnoreCase("Triangle")){
			return new Triangl();}
		else if(str.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else
			return null;
		}
	}

