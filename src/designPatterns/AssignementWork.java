package designPatterns;

public class AssignementWork {
	private Pen p;

	public void setP(Pen p) {
		this.p = p;
	}

	public Pen getP() {
		return p;
	}
	
	public void writeAssignement(String str) {
		p.write(str);
	}
}
