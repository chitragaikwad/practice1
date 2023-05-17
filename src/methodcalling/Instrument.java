package methodcalling;
// This class is explains about medical instruments
public class Instrument {
 String Name;
 int Price;
 float Range;
 public Instrument ( ) {   //no argument
	 System.out.println("Important Medical Instrument  use at initial stage is Stethoscope");
 }
 public static void type1 (String E) { // one argument static method
	  System.out.println(" One of the instument is used to cut :"+E);
 }
 public static void type2(String L, int P) {  // two argument static method
	 System.out.println("Type two instrument is used to tooth surgical:"+L);
	 System.out.println("Thermometer price isin Rs : "+P);
 }
 public void  type3 () {               // no argument  non static method
	System.out.println("Type three instrument is Retractor" );  
 }
 public void type4(float T) {          // one argument non static method
	 System.out.println("Type four instrument is Nebulizer and its pressure range is:"+T);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Information about Mediacal Instuments");
// call methods sequentially
Instrument opt =new Instrument();
opt.type3();// non static 
opt.type4(30.5f); // non static
type1("Scissors");  // static method
type2("Forceps",833);// static method

	}

}
