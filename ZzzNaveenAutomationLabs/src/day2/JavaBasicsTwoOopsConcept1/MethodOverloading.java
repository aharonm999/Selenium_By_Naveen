package day2.JavaBasicsTwoOopsConcept1;

public class MethodOverloading {
	
/*
 - When the method name is same and with different arguments with in a same class are called Method overloading.
 - Duplicate methods are not allowed i.e same method name with same arguments are not allowed.
 - Cannot crate a method inside a method
 - Can we overload main()? : Yes - we can overload main()
 */
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(22.01);
		obj.sum(10, 20);
	}

	public void sum() {
		System.out.println("Sum method - Zero parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum method - 1 input");
		System.out.println(i);
	}
	
	public void sum(double d) {
		System.out.println("Sum method - 1 input, but different Data Type");
		System.out.println(d);
	}
	
	public void sum(int a, int b) {
		System.out.println("Sum method - 2 inputs");
		System.out.println(a+b);
	}
}
