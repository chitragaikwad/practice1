package methodcalling;
//This class is explains about Food Cultures
public class Food {
	
public static void Culture() { //static method
	System.out.println("!!There are various food cultures around the world!!");
}

public static void Italian() { //static method
	System.out.println("1.Risotto is one of the famous dish from Italian food.");
}

public static void French() { //static method
	System.out.println("2.Boeuf Bourguignon is the speciality food of France.");
}

public void Greek() { // non static method
	System.out.println("3.Moussaka is traditional dish of greek.");
}

public void Spanish() { // non static method
	System.out.println("4.Flan is popular dessert in Spain.");
}

public void Indian () { // non static method
	System.out.println("5.Misal Pav is one of the famous dish Within Mharashtra as Indian fast food.");
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("****Types of Foods***");
// call static methods sequentially
Culture();
Italian();
French();
//call non static methods sequentially
Food cuisine =new Food();                 // syntax
cuisine.Greek();
cuisine.Spanish();
cuisine.Indian();
	}

}
