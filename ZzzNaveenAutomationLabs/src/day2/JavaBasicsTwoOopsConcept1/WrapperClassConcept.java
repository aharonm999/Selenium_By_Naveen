package day2.JavaBasicsTwoOopsConcept1;

public class WrapperClassConcept {
	
/* How to convert data types from one to other. */
	
	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		// Data conversion: String to integer
		int i = Integer.parseInt(x);
		System.out.println(i);
		
		// Data conversion: String to double
		String s = "12.33";
		double d = Double.parseDouble(s);
		System.out.println(d);
		
		// Data conversion: String to boolean
		String ss = "true";
		boolean b = Boolean.parseBoolean(ss);
		System.out.println(b);
		
		// Data conversion: int to String
		int j = 200;
		String s1 = String.valueOf(j);
		System.out.println(s1+20);
		
		// We cannot convert partial integer number - we will get exception : NumberFromatException
		String u = "100A"; // not a pure integer
		Integer.parseInt(u); // here it gives NumberFromatException.
		
				
	}

}
