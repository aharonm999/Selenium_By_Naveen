package day1.JavaBasicsOne;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.55;
		
		// String Concatenation
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("Hello World");
		System.out.println("The value of a:" + a);
		System.out.println("The value of b:" + b);
		System.out.println("The addition of a & b is:" + (a+b));
		
		// println - is used to print on the console with a new line
		// print - is used to print on the console

		System.out.print("Hi Bangalore");
		System.out.println("Hi Dubai");
		
	}

}
