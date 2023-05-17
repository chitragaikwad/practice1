package methodcalling;
// This is explains about method overloading
public class Overloading {
String Type;
float Sharevalue;
public Overloading() {                                     //No argument
System.out.println("Types of Financial statements");	
}
public Overloading(String R, float T ) {                //two arguments 
	R = "Cash flow";
	T = 868.65f;
	System.out.println("Cash inflow and cash outflow integrates:"+R);
	System.out.println("Share value of ICIC Bank Ltd:"+T);
}
public static void shareholder() {                                       // no arguments  with static method
	System.out.println("Common shareholder is first type of shareholder");
}
public static void shareholder(String k) {                                // one argument with static method
	System.out.println("Types of share: " +k);
	}
public static void shareholder (String G, int P) {                          // two argument with static method
	System.out.println("Common shareholder enjoy:"+ G);
	System.out.println("Share value of Wipro Ltd:"+P);
}
public void shareholder(float J) {                                        // one argument non static method as same as static method
	System.out.println("Nifty for today:"+ J);
}
public void market() {                                                       // zero argument  with non static method 
	System.out.println("Tyes of Share Market is Mony market and capital market");
}
public void market(String D,int Q) {                                           // two argument with non static method
	System.out.println("Maturity period of Mony market is :"+D);
	System.out.println("Sensex is :"+Q);
}
public void market (String V, float H,int M) {                                 // three argument with non static method
	System.out.println("Maturity period of Capital market is:"+V);
	System.out.println("Sharevalue of Reliance Ltd :"+H);
	System.out.println("Rank of company on BSE:"+M);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Study about method overloading");
 new Overloading();                                               //call no argument constructor
new Overloading("Money",755.2f);                            // call two argument constructor
shareholder();                                              // call static method with no argument
shareholder("Pereference Shareholder");                     // call static method with one argument
shareholder ("Dividend",870);                                 // call static method with two argument
Overloading Non =new Overloading();                //   non static method calling syntax
Non.shareholder(50.5f);                       // call  one argument non static method as same as static method
Overloading obj= new Overloading();           //call non static  method syntax
obj.market();      // call non static method with zero argument
obj.market("One year",7758); // call two argument with non static method
obj.market("More than One year",2628.6f,23); // call three argument with non static method


	}

}
