package methodcalling;
// This class explains about Country INDIA
public class Country {
	
public static void Bharat() {   // Static method
	System.out.println(" ##INDIA is the Seventh largest country by area## ");
}
public static void Ocean() {     // Static method
	System.out.println("**India is bounded by oceans on South,SouthWest,SouthEast**");
}
public  void Capital () {        // Non static method
	System.out.println("$$New Delhi is the Capital of India$$ ");
}
public void Population() {              // Non static method
	System.out.println("%%Indian population count is 138 crores @[ 2020]%%");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Information about my Country INDIA");
// Call Static method Sequentially 
Bharat();
Ocean();
// call Non static methods sequentially
Country Ganarajya =new Country();  // syntax
Ganarajya.Capital();   
Ganarajya.Population();
// Call one Static method from other class State
   State.Count();
 // Call one non static method from other class state
   State obj =new State();  // taken object is different
   obj.Area();


	}

}
