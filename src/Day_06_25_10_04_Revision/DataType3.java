package Day_06_25_10_04_Revision;

public class DataType3 {

	public static void main(String[] args) {

		//Int data Types - size - 4 byte - 32 bit (-2147483648 to 2147483647)
		
		int i1 = 127;
		int i2 = 32767;
		int i3 = 2147483647;
//		int i4 = 2147483648;
		
		System.out.println("Int data type -->"+i1);
		System.out.println("Int data type -->"+i2);
		System.out.println("Int data type -->"+i3);
		System.out.println("********************");
		
		int i4 = -127;
		int i5 = -32767;
		int i6 = -2147483647;
//		int i7 = -2147483649;
		
		System.out.println("Int data type -->"+i4);
		System.out.println("Int data type -->"+i5);
		System.out.println("Int data type -->"+i6);
		System.out.println("********************");
		
	//	Long datatypes - 8 byte - 64 bit  - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		
		long l1  = 32767;
		long l2  = 2147483647;
		long l3 =  214748367575l;
		
		System.out.println("Long data type -->"+l1);
		System.out.println("Long data type -->"+l2);
		System.out.println("Long data type -->"+l3);
		
		System.out.println("********************");
		
	//	long l4 = - 92233720368547848475l;
	
	}

}
