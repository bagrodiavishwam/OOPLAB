package lab6;

public class MovePoint implements Move{
	private int x,y,z;
	public MovePoint(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public String toString() {
		return "The point is a: ("+x+","+y+","+z+")";
		
	}
	
	public void moveUp() {
		y++;
	}
	public void moveDown() {
		y--;
	}
	public void moveRight() {
		x++;
		
	}
	public void moveLeft() {
		x--;
	}
	public void move3DUp() {
		z++;
	}
	public void move3DDown() {
		z--;
	}
}
