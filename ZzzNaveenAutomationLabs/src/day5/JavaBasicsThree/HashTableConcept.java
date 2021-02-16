package day5.JavaBasicsThree;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		h.put(3, "Benz");
		h.put(4, "Tom");
		
		// How to check the value presented in a specific key
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		// How to restrict the defining data
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		
		h1.put(1, 100);
		//h1.put("A", 200) // This is not allowed
		
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		
		h2.put(1, "Audi");
		//h2.put(2, 200) // This is not allowed
		
		
		
		
		
		
		
		
		
	}

}
