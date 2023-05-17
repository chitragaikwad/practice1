package methodcalling;
//This class explains about musical instruments  
public class Musicinstruments {
String name;
int price;
int Length;
public Musicinstruments() {   // no argument
	System.out.println("Musical Istruments Integrates the incredable Song!!");
}
public static void info1() {     //static method with no argument
	System.out.println("Sitar is plucked stringed type instrument");
}
public static void info2(String T, int R) {    // static method with two argument
	System.out.println("The name of instrument which is used for folk & classical Hindustani music :"+T);
	System.out.println("Length of sarangi in cm:"+R);
}
public void info3() {    //  non static method with no argument
	System.out.println("Music creates supreme happiness around ");
}
public void info4(String W,int H) {  // non static method with two arguments
	System.out.println("Indian graet Tabla playes is:"+W);
	System.out.println("Price  of a Tabla is in Rs:"+H);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Information about Musucal instruments");
// Call static method sequentially
info1();
info2("Sarangi",70);
//Call non static methods sequentially
Musicinstruments art =new Musicinstruments();
art.info3();
art.info4("Zakir Hussain",3590);
//call  one static method from other class Instrument with passing two  arguments
  Instrument. type2("Forceps",833);
  //call one non static methods from other class Instrument with passing one argument
  Instrument opt = new Instrument();
  opt.type4(30.5f);
	}

}
