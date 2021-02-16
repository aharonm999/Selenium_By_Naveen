package day4.JavaBasicsTwoOopsConcept3;

public interface USBank {
	
	// Interface contains only method declarations
	// No method body - Only method prototype
	// In interface, we can declare the variables, variables are by default static in nature
	// Variables will not be changed
	// No static methods in interface
	// No main() method in interface
	// We cannot create the object of interface
	// Interface is abstract in nature
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	

}
