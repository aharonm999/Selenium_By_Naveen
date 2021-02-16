package day2.JavaBasicsTwoOopsConcept1;

public class StaticAndNonStaticVariables {
	
	// Global variables: The scope of the global variables are across the functions with some conditions.
	
	String name = "Tommy"; // non-static variable
	static int age = 25; // static variable
	
	public static void main(String[] args) {
		
	// How to call static methods and variables?
	// 1. Direct calling:
		sum();
		
	// 2. Calling by class name
		StaticAndNonStaticVariables.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticVariables.age);
		
	// How to call Non-static methods and variables
		StaticAndNonStaticVariables obj = new StaticAndNonStaticVariables();
		obj.sendMail();
		System.out.println(obj.name);
		
	// Can i access static methods by using Object reference? YES
		obj.sum();

	}

	public void sendMail() {
		System.out.println("Send mail method");
	}
	
	public static void sum() {
		System.out.println("Sum method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
