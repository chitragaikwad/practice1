package methodcalling;
// This class is explains about States in India
public class State {
	
public static void Count() {  // Static method 
	System.out.println("Total nouber of Stesates in India is 28 States");
}
public static void Territories() {   // Static method
	System.out.println("Total Union Territories in India is 8");
}
public void Area() {   // Non static method
	System.out.println("Madhya Pradesh is laegest state by area in India");
	}
public void First() {         //Non Static method
	System.out.println(" Andhra pradesh is the First state in India");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Information about States wihin in my country INDIA");
//Call Static Method Sequentially
Count();
Territories();
// Call Non static Methods Sequentially
State Part = new State();
Part.Area();
Part.First();
	}

}
