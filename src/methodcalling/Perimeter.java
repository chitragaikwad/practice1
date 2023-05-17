package methodcalling;
//This class is explains about perimeter of reactangle
public class Perimeter {
int l;
int w;
public void methodcall() {
	l=12;
	w=16;
	double peri2 = 2*(l+w);
	System.out.println("Value of reactangle perimeter="+peri2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Perform the operation on calculating perimeter of reactangle");
Perimeter rec =new Perimeter();
rec.methodcall();
// call another class in one class
Circumference obj = new Circumference();
obj.democall();
}
}
