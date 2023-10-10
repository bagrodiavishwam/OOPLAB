package collection;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        hs.add("Omega");
        hs.add(null);
        hs.add("Hello World");

        System.out.println(hs);
    }
}

