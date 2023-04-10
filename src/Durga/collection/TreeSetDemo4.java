package Durga.collection;

 
 
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String[]args) {
		TreeSet t = new TreeSet(new Mycomparator());
		t.add("A");
		t.add("Z");
		t.add("K");
		t.add("L");
		System.out.println(t);
		}}
class Mycomparator implements Comparator{

	
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}
}