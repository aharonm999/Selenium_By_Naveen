package day2.JavaBasicsTwoOopsConcept1;

public class Car {
	
/*How to create an object,  what is a class, how to call class vaiables for each and every Object */
	
	//Class variables
	int model;
	int wheel;

	public static void main(String[] args) {
		
	// new key word is used to create the Object
	// new car() -- this is the Object of Car class
	// a,b,c -- these are Object reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2020;
		a.wheel = 4;
		
		b.model = 2018;
		b.wheel = 6;
		
		c.model = 2016;
		c.wheel = 8;
		
	// Before assigning the references
		System.out.println("Before assigning the references");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
	
	// after assigning the references	
		System.out.println("After assigning the references");
	// Shifting of Object references from one object to another Object
		a=b;
		b=c;
		c=a;
		
		a.model = 10;
		System.out.println(a.model); // 10
		c.model = 20;
		System.out.println(a.model);// 20
		System.out.println(c.model);// 20
		
	}

}
