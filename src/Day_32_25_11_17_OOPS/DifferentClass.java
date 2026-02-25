package Day_32_25_11_17_OOPS;

import Day_33_25_11_18_OOPS.Program1;

public class DifferentClass extends Program1{

	public static void main(String[] args) {

		AcessModfiers Ac = new AcessModfiers();
//		Ac.Demo();
//	    System.out.println(Ac.data);
		Ac.Test();
		System.out.println(Ac.data1);
		
		Ac.msg();
	    System.out.println(Ac.num);
	    
	    DifferentClass p1 = new DifferentClass();
	    
	    p1.name();
	    System.out.println(p1.num);
		
	}

}
