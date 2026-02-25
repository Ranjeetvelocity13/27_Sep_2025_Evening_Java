package Day_08_25_10_07_Method;

public class Method9 {

	public void Demo1() {
		
		System.out.println("Non static method Demo1");
	}
	
	public void Demo2() {
		
		System.out.println("Non static method Demo2");
		
	}
	
	public void Demo3() {
		
		System.out.println("Non static method Demo3");
	
		
	}
	
	public static void main(String[] args) {

		//ClassName objectName = new ClassName();

		Method9 obj1 = new Method9();
        
        //nonStaticmethod9 - class name
        // obj1 = object name
        //new -  keyword used to create a new object
        //ClassName(); - constructor
        
        //Calling
        //objectName.methodname();
        
        obj1.Demo1();
        obj1.Demo2();
        obj1.Demo3();
        
	}

}
