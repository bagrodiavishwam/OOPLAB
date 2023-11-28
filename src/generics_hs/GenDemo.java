package generics_hs;

//import java.util.*;
//import java.io.*;

public class GenDemo {
	public static void main(String []args) {
		Gen<Integer> iOb;
		iOb=new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println(v);
	}

}
