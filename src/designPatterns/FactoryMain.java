package designPatterns;
//import com.phone.Android;
//import com.phone.IOS;
import com.phone.OS;
import com.phone.OSFactory;
//import com.phone.WindowsOS;


//Factory Design Pattern
public class FactoryMain {
	
	public static void main(String[]args) {
		OSFactory osf=new OSFactory();
		OS obj=osf.getInstance("Secure");
		obj.specs();
	}
}
