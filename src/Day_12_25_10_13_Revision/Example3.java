package Day_12_25_10_13_Revision;

public class Example3 {

	public static void main(String[] args) {

		
		//Data Types in java
		
	//	Data Types define what kind of value a variable can hold
	//	types - primitive data types 2. Non-primitve data types
	//	Java has 8  primitive and non-primitive type (String, Array, class, object)
		
	//	byte  - 8 bit - 1 byte   //-128 to 127
		
		byte b1 = 100;
		//512 MB  - Movie downlaod - 500, 800 MB

		byte b2 = 127;
	
		byte b3  = -120;
		
		byte b4 = -128;
		 
	//	byte b2 = 130; - not allowed to store the value more than 127 
		
		System.out.println("Byte data Type :"+b1);
		System.out.println("Byte data Type :"+b2);
		System.out.println("Byte data Type :"+b3);
		System.out.println("Byte data Type :"+b4);
		
		//int  - 32 bit - 4 byte 
		System.out.println("---------------------------");
		
		int i1 = -2147483648;
		int i2 = 2147483647;
		
		System.out.println("int data type :"+i1);
		System.out.println("int data type :"+i2);

		System.out.println("---------------------------");

		//short - 16 bit - 2 byte
		
		short s1 = 300;
		short s2 = -400;
		
		System.out.println("Short Data Type :"+ s1);
		System.out.println("Short Data Type :"+ s2);
		
		//float  - 32 bit - 4 byte
		//double - 64 bit - 8 byte
		System.out.println("---------------------------");


		float f1 = 40.45f;
		float f2 = -40.45f;
		
		double d1 = 40.45d;
		double d2 = -40.45d;
		
		System.out.println("float data Type :"+ f1);
		System.out.println("float data Type :"+ f2);
		System.out.println("---------------------------");

		
		System.out.println("Double data Type :"+d1);
		System.out.println("double data Type :"+d2);
		System.out.println("---------------------------");

		

		//boolean - 1 bit
		boolean b11 = true;
		boolean b22 = false;
		
		//boolean b23 = test;
		System.out.println("Boolean data Type :"+b11);
		System.out.println("Boolean data Type :"+b22);
		
		//long data type  - 64 bit - 8 byte
		System.out.println("---------------------------");

		long l1 = 9857575744l;
		long l2 = -9857575744l;
		
		System.out.println("Long data Type :"+ l1);
		System.out.println("Long data Type :"+ l2);
		
		System.out.println("---------------------------");

		//char data type - 2 byte - 16 bit
		
		char c1 = 'A';
		char c2=  '2';
		char c3 = '@';
	//	char c4 = 'AA';  // not allowed 
		
		System.out.println("Char data Type :"+c1);
		System.out.println("Char data Type :"+c2);
		System.out.println("Char data Type :"+c3);
		
	}

}
