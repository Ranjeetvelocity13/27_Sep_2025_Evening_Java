package Day_36_25_11_21_OOPS;

public class ChildClass extends AbstractionClass{

	ChildClass(){
	
		super();
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		ChildClass cs = new ChildClass();
		
		cs.test();
		cs.Test1();
	}

	@Override
	public void test() {
		
		System.out.println("Child class Method");
		
	}
	
}
