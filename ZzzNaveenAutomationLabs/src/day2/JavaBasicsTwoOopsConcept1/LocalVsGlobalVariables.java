package day2.JavaBasicsTwoOopsConcept1;

public class LocalVsGlobalVariables {
	
/*
  Global/Class variables:
  - Scope of the global variables are within the class level
  - To access the global variables in main() we need to create an Object.
 
 */
	String name = "India";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10; // Local variable for main()
		System.out.println(i);
		
//To access the global variables in main() we need to create an Object.
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
	
	public void add() {
		
		int i = 20; // local variables for add() 
		int j = 30;
	}

}
