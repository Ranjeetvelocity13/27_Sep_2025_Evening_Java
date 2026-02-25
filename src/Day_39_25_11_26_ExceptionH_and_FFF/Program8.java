package Day_39_25_11_26_ExceptionH_and_FFF;

class Demo {

    // finalize() is called by Garbage Collector before deleting an object
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called before object deletion");
    }
}

public class Program8 {

    public static void main(String[] args) {

        // finalize() → method called by JVM's Garbage Collector
        Demo D1 = new Demo();

        D1 = null;   // Object is now eligible for garbage collection

        System.gc(); // Request JVM to run Garbage Collector

        System.out.println("End of main");
    }

    // Throwable → Superclass of ALL exceptions and errors in Java
    
}
