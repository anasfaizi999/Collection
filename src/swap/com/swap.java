package swap.com;

public class swap {
 public static void main (String args[]) {
	 
	 int x=20;
	 int y=10;
	 
	 x = x + y;// x= 20+10=30
	 
     y = x - y; // y= 30-10= 20
     
     x = x - y; // x= 30 -20=10
     
     System.out.println("After swapping:"
             + " x = " + x + ", y = " + y);
			 
	 
 }
}
