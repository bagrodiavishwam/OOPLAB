package collection;
import java.util.*;
public class LinkedHashSetDemo {
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

        System.out.println(hs);
    }
}
}
