package day3.JavaBasicsTwoOopsConcept2;

public class TestCar {

	public static void main(String[] args) {
		
		// Static Polymorphysm or Compile time Polymorphysm
		BMW obj = new BMW();
		obj.start(); // when ever we have same methods in both Parent and child class, default java prefers child class method.
		obj.stop();
		obj.refule();
		obj.threatSaftey();
		obj.engine();
	
		System.out.println("*************");
		
		Car obj1 = new Car();
		obj1.start();
		obj1.stop();
		obj1.refule();
		
		// Dynamic Polymorphysm OR Runtime Polymorphysm
		// i.e child class object can be referred by parent class reference variable. 
		// this is also called "Top Casting". Down casting is not allowed.
		Car obj2 = new BMW();
		obj2.start();
		obj2.stop();
		obj2.refule();
		
		// Down casting : Down casting is not allowed. it gives runtime exception.
	//	BMW b1 = (BMW)new Car();
		
	}

}
