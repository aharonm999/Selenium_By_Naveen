package day3.JavaBasicsTwoOopsConcept2;

public class BMW extends Car{ // Has-a relationship
	
	// Method overriding: When same method is present in Parent class as well as Child class with the same name and same number of arguments, is called Method-Overriding.
	
	public void start() { // Overridden method
		System.out.println("BMW start");
	}
	
	public void threatSaftey() {
		System.out.println("BMW Threat safty");
	}

}
