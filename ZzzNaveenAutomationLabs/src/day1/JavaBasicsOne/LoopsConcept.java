package day1.JavaBasicsOne;

public class LoopsConcept {

	public static void main(String[] args) {

		// while loop
		// Dis-advantage of while loop: It will generate infinite loop if we don't give increment/decrement part
		
		int i=1; // initialization
		while(i<=10) { // condition
			System.out.println(i);
			i = i+1; // increment/decrement
		}
		
		System.out.println("*****************************************");
		
		// for loop
		
		for(int j=1;j<=10;j++) { // initialization, Conditional, Incremental
			System.out.println(j);
		}
		
		for (int k=10;k>=0;k--) { // initialization, Conditional, Decremental
			System.out.println(k);
		}
	}

}
