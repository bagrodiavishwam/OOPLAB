package designPatterns;

public class School {

	public static void main(String[] args) {
		Pen p=new PenAdapter();
		AssignementWork aw=new AssignementWork();
		aw.setP(p);
			aw.writeAssignement("OOP YAAR!!");
		}

	}


