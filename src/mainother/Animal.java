package mainother;
//   This is Animal class explains about types of animal
public class Animal {
	// this type of animals explains those animals eat only plants
public static void HerbivoresAnimals1() {
	System.out.println("Cow like to eat green grass ");
}
// this types of animals explains those who eat  both meat and plants
public static void OmnivoresAnimals1() {
	System.out.println("Polar Bears likes to eat meat and plants");
}
// this also some more examples of types of animals
public static void CarnivoresAnimals1() {
	System.out.println(" I am Simba Lion & I loves to eat meat" + " I am king of Jungle ");
}
public void HerbivoresAnimals2() {
	System.out.println(" Hello, I am Monty Horse I  likes to eat green grass" + " I can run at the speed 88km/h ");
}
public void OmnivoreAnimals2() {
	System.out.println("Hi,I am Bella Cat and I like to eat meat and to drink milk ");
}
public void CarnivoresAnimals2() {
	System.out.println("Hi am Sherkhan Tiger i loves to eat meat;");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this explain basic information about animals
System.out.println("Animals is one of the important phase in food chain");
System.out.println("Their are various types of animals on earth");
System.out.println("Types of animals - Herbivores,Omnivores,Carnivores");
System.out.println("Herbivores types of animals eat only plants");
System.out.println("Crnivores types of anials eat only meat");
System.out.println("Omnivores types of animals eat both plants and meat");
//just call out this methods sequentially
Animal Horse = new Animal();
Animal Cat = new Animal();
Animal Tiger =new Animal();



Animal.HerbivoresAnimals1();
Animal.OmnivoresAnimals1();
Animal.CarnivoresAnimals1();
Horse.HerbivoresAnimals2();
Cat.OmnivoreAnimals2();
Tiger.CarnivoresAnimals2();

	}

}
