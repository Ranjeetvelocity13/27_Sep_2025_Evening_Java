package Day_36_25_11_21_OOPS;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal an = new Dog();
		an.sound();
		an.Demo(); //demo 1
//		an.Demo();  
		
		Dog d = new Dog();
		d.demo3();
		d.Demo();
		d.sound();
	}

	@Override
	public void sound() {
		
		System.out.println("Dog Barks");
		
	}
	
//	public void Demo() {
//		System.out.println("Demo 2");
//	}
	
	public void demo3() {
		System.out.println("Demo 3 method");
		
	}
	
	

}
