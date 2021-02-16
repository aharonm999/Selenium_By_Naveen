package day4.JavaBasicsTwoOopsConcept3;

public class HSBCBank implements USBank, BrazilBank{ // we are achieving multiple inheritance.
// This is also called as Is-a relationship.

	//If a class is implementing any Interface, then its mandatory to define/override all the methods of Interface. 

// Overriding from USBank 	
	@Override
	public void credit() {
		System.out.println("HSBC Credit");			
	}

	@Override
	public void debit() {
		System.out.println("HSBC debit");	
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC transferMoney");

// Separate methods of HSBC bank 		
	}
	public void educationLoan() {
		System.out.println("HSBC educational loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC car loan");
	}
	
// Overriding from BrazilBank 
	@Override
	public void mutualFund() {
		System.out.println("HSBC Mutual fund");
	}
	
}
