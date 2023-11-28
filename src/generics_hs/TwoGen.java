package generics_hs;

public class TwoGen<T, V> {
	
	T ob1;
	V ob2;
	
	TwoGen(T o1, V o2){
		ob1=o1;
		ob2=o2;
	}
	
	void showTypes() {
		System.out.println("T is: "+ob1.getClass()+" and that of V is: "+ob2.getClass());
	}
	
	T getOb1() {
		return ob1;
	}
	
	V getOb2() {
		return ob2;
	}
}
