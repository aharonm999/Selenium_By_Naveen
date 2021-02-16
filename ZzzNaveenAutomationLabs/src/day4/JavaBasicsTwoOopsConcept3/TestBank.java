package day4.JavaBasicsTwoOopsConcept3;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		System.out.println(USBank.min_bal);
		
		// dynamic polymorphism
		// child class object can be referred by parent interface reference variable
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
	}

}
