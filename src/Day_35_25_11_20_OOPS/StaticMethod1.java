package Day_35_25_11_20_OOPS;

public class StaticMethod1 {

    // Static methods → CAN NOT be overridden, only hidden
    public static void Demo1() {
        System.out.println("Parent Demo1 method");
    }

    public static void Demo2() {
        System.out.println("Parent Demo2 method");
    }

    // Non-static → Can be overridden
    public void Demo3() {
        System.out.println("Parent Demo3 method");
    }
}
