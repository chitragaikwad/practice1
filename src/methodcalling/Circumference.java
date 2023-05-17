package methodcalling;
//This class explains about Circumference of circle with the help of constructor
public class Circumference {
float r;
float pie;
 public  void democall() {
	r = 8.5f;
	pie  = 3.14f;
double	T= 2*pie*r;
	System.out.println("value of circle circumference="+T);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Perform the operation of calculate circumference");
Circumference obj = new Circumference();
obj.democall();

	}
	

}
