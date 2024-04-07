package StaticBlock;

public class StaticClass {

    StaticClass()
    {
        System.out.println("Constructor Called");
    }
    public static void method()
    {
        System.out.println("Static method called.");
    }

    static {
        System.out.println("Static block called");
    }

    public static void main(String[] args) {
        StaticClass sc=new StaticClass();
        method();
    }
}
