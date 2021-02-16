package day2.JavaBasicsTwoOopsConcept1;

public class FunctionsOrMethodsInJava {

/*Functions or Methods both are same 
 *We have three types of methods i.e
 1.No input, No output
 2.No input, but some output
 3.Some input, some output*/
	// main method is --> starting point of execution
	public static void main(String[] args) {
// main method is void, bcz it never returns a value.		
// One object will be created, obj is the reference variable to this object
// after creating the object, the copy of all non static methods will be given to this object		
		FunctionsOrMethodsInJava obj = new FunctionsOrMethodsInJava();
		
		obj.methodOne();
		
		int m2 = obj.methodTwo();
		System.out.println(m2);
		
		String m22 = obj.methodTwoo();
		System.out.println(m22);
		
		int m3 = obj.methodThree(5, 9);
		System.out.println(m3);
	}
// Non-Static methods

	// void - does not return any value
	// here return type of methodOne is void
	public void methodOne() {
		System.out.println("No input, No Output");
	}
	// return type - int
	public int methodTwo() {
		System.out.println("No input, But some output");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	// return type - String
	public String methodTwoo() {
		System.out.println("NO INPUT, BUT SOME OUTPUT");
		String s = "Selenium";
		
		return s;
	}
	// x, y are input arguments or parameters
	// return type - int
	public int methodThree(int x, int y) {
		System.out.println("Some input, Some output");
		int d = x+y;
		
		return d;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
