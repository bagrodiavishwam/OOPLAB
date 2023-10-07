package lab6;

public class MovablePoint implements Movable{
	// Private member variables
	private int x, y; // (x, y) coordinates of the point
	// Constructor
	public MovablePoint(int x, int y) {
	this.x = x;
	this.y = y;
	}
	public String toString() {
	return "Point at (" + x + "," + y + ")";
	}
	// Implement abstract methods defined in the interface Movable
	public void moveUp() {
	y++;
	}
	public void moveDown() {
	y--;
	}
	public void moveLeft() {
	x--;
	}
	public void moveRight() {
	x++;
	}
}
