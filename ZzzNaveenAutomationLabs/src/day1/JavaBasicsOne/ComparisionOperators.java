package day1.JavaBasicsOne;

public class ComparisionOperators {

	public static void main(String[] args) {

	// Comparision operators [< > <= >= == !=]
		int a = 10;
		int b = 20;
		
		if(a<b) {
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("A is greater");
		}
		
		int c = 40;
		int d = 40;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else
		{
			System.out.println("c and d are not equal");
		}
		
		// Write a program to find the highest number
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is greater");
		}else if(b1>c1) {
			System.out.println("b1 is geater");
		}else {
			System.out.println("c1 is greater");
		}
	}

}
