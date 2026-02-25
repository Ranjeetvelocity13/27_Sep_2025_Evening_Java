package Day_35_25_11_20_OOPS;

public class AbstractDemoImpl extends AbstractDemo {

    @Override
    public void m3() {
        System.out.println("Child implementation of m3 method");
    }

    public static void main(String[] args) {

        AbstractDemo obj = new AbstractDemoImpl();
        obj.m3();  // Calls child implementation
        obj.m2();  // Calls parent complete method
    }
}
