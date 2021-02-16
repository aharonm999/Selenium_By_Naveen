package day1.JavaBasicsOne;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		// ++
		// --
		
		// post increment
		int i = 1;
		int j = i++; // i will be assigned to j first and then increase the i value by 1. so i=2, j=1.
		
		System.out.println(i);
		System.out.println(j);
		
		// pre increment
		
		int a = 1;
		int b = ++a; // a will be increment by 1 first and then assigned the value to b. so a=2, b=2.
		
		System.out.println(a);
		System.out.println(b);
		
		// Post decrement
		
		int m = 2;
		int n = m--; // m will be assigned to n first and then decrease the m value by 1. so m=1, n=2.
		
		System.out.println(m);
		System.out.println(n);
		
		// pre decrement
		
		int p = 2;
		int q = --p; // decrease the p by 1 first and then assigned to q. so p=1, q=1.
		
		System.out.println(p);
		System.out.println(q);
	}

}
