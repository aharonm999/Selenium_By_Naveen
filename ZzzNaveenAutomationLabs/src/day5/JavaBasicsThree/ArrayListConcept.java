package day5.JavaBasicsThree;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100); // index 0
		ar.add(200); // index 1
		ar.add(300); // index 2
		
		System.out.println(ar.size());
		
		ar.add(400); // index 3
		ar.add(500); // index 4
		
		System.out.println(ar.size());
		
		ar.add("Tom"); // index 5
		ar.add("Hello"); // index 6
		ar.add("12.33"); // index 7
		ar.add('M'); // index 8
		ar.add(600); // index 9
		
		System.out.println(ar.size());
		ar.remove(9);
		
		System.out.println(ar.size());
		
		// How to get the value of index 4
		System.out.println(ar.get(4));
		
		// To print all the values of arraylist: we use for loop.
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//If we want to enter only numerics then we use wrapper class
		ArrayList<Integer> ar1 = new ArrayList();
		ar1.add(100);
		//ar1.add("Tom"); // This is not allowed
	
		//If we want to enter only String values then we use wrapper class
		ArrayList<String> ar2 = new ArrayList();
		ar2.add("Tom");
		//ar2.add(100); // this is not allowed
	
	
	
	
	}

}
