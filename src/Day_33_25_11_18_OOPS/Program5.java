package Day_33_25_11_18_OOPS;

public class Program5 {

    public static void main(String[] args) {

        // Automatic promotion / Widening
        // Small → Large primitive type automatically converts

        // byte → short → int → long → float → double
        // char → int → long → float → double

        Program5 p5 = new Program5();

        p5.Demo();                 // Zero input param
        p5.Demo(10895959995L);     // Calls Demo(long)
        p5.Demo('c');              // 'c' → ASCII 99 → promoted to double → calls Demo(double)
        p5.Demo(10.5f);            // Calls Demo(float)
        p5.Demo((byte)10);         // Calls Demo(byte)
    }

    // 1. Zero-param method
    public void Demo() {
        System.out.println("Zero input param method");
    }

    // 2. double param
    public void Demo(double d1) {
        System.out.println("double input param method");
    }

    // 3. float param
    public void Demo(float f1) {
        System.out.println("float input param method");
    }

    // 4. long param
    public void Demo(long l1) {
        System.out.println("long input param method");
    }

    // 5. byte param
    public void Demo(byte b1) {
        System.out.println("byte input param method");
    }
}
