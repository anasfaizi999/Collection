package Durga.collection;

 
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	 

	public static void main(String [] args) {
		 LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("c");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("B"));
		System.out.println(h);

}
}