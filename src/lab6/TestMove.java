package lab6;

public class TestMove {
	public static void main(String []args) {
		Move m1=new MovePoint(10,10,10);
		System.out.println(m1);
		m1.moveDown();
		System.out.println(m1);
		m1.move3DUp();
		System.out.println(m1);
	}
}
