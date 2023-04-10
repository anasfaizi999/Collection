package Durga.collection;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet t =  new TreeSet();
	/*t.add("A");
	t.add("a");
	t.add("B");
	t.add("Z");
	t.add("L");
	// t.add(new Integer(10));//CCE*/
	t.add(null);//---NPE
	t.add("A");
	System.out.println(t);
}
}
;
