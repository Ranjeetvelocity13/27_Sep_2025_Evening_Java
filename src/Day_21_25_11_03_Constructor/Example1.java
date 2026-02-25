package Day_21_25_11_03_Constructor;

public class Example1 {

	
	 String name;
	 int rollNo;
	 
	public Example1(String Name, int RollNo) {
		
		name = Name;
		rollNo = RollNo;
		
	}
	
	public static void main(String[] args) {

	
		Example1 s1  = new Example1("Akash",101);
		
		Example1 s2 =  new Example1("Virat",102);
		
		Example1 s3 =  new Example1("Rohit",103);
		
		Example1 sn = new Example1("Rahul",104);
		
		
		//Printing student info
		System.out.println(s1.name + "--->"+ s1.rollNo);
		System.out.println(s2.name + "--->"+ s2.rollNo);
		System.out.println(s3.name + "--->"+ s3.rollNo);
		System.out.println(sn.name +" --->"+ sn.rollNo);
			
	}
	/*
	 * Constructor 
A constructor in Java is a special method used to initialize objects. It is called when an instance (object) of a class is created.Constructors has the same name as the class and does not have a return type, not even void. 
Every time an object is created using the new() keyword, at least one constructor is
called.

If there is no constructor available in the class. In such case, Java compiler provides a default constructor..
	 */

}
