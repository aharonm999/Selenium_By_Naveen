package day1.JavaBasicsOne;

public class ArrayConceptOneD {

	public static void main(String[] args) {
/*	1D - 1 Dimensional Array:
	- array: we use array to store similar data type values in a array variable
	- Adv: 1. can store similar data types in array.
	- Dis: 1. size is fixed. Thats why it is called STATIC Array. [to overcome this problem we use Collections - ArrayList, HashTable use Dynamic arrays]
 		   2. stores only similar data types not other.	[to overcome this problem we use Object array]	*/
/* 1. int array:
	- Lowest bound/index = 0
	- Upper bound/index = n-1 (n is size of array) */
		
		int i[] = new int[4];
			i[0] = 10;
			i[1] = 20;
			i[2] = 30;
			i[3] = 40;
			
			System.out.println(i[2]);
			System.out.println(i[3]);
			//System.out.println(i[4]); // it gives ArrayIndexOutOfBoundException
			System.out.println(i.length); // .length will give you the size/length of an array
	
			// print all values of an array - we use for loop
			
			for(int j=0;j<i.length;j++) {
				System.out.println(i[j]);
			}
	
//2. double array
			
			double d[] = new double[3];
			d[0] = 12.33;
			d[1] = 15.33;
			d[2] = 18.33;
			
			System.out.println(d[2]);
	
//3. char array
	
			char c[] = new char[3];
				c[0] = 'a';
				c[1] = '2';
				c[2] = '$';
				
				
//4. boolean array
			boolean b[] = new boolean[2];
					b[0] = true;
					b[1] = false;
//5. String array
					
			String s[] = new String[3];
					s[0] = "Hi";
					s[1] = "Hello";
					s[2] = "How are you";
			System.out.println(s.length);		

// 6. Object array [Object is a super class] -  and used to store different data types values
			Object obj[] = new Object[6];
				obj[0] = "Tom";
				obj[1] = 25;
				obj[2] = 12.33;
				obj[3] = 1/4/1990;
				obj[4] = 'M';
				obj[5] = "London";
				
			System.out.println(obj.length);
	}
}
