package Day_35_25_11_20_OOPS;

public class ReturnType1 {

    // Parent returns Object
    public Object Demo1() {
        System.out.println("Parent Demo1 method (Object return)");
        return null;
    }

    // Parent returns String
    public String Demo2() {
        System.out.println("Parent Demo2 method (String return)");
        return "Test";
    }

    // Parent returns primitive int
    public int Demo3() {
        System.out.println("Parent Demo3 Method (int return)");
        return 30;
    }
}
