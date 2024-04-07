package MethodOverloading;

public class MethodOverloadingExample extends MethodOverridding {

    private static int add(int a, int b) {
        System.out.println("Calling add with two parameters");
        return a + b;
    }

    private static int add(int a, int b, int c) {
        System.out.println("Calling add with three parameters");
        return a + b + c;
    }

    protected static void multiply(int a, int b) {

        System.out.println("Inside Child: "+ a*b);

    }

    public static void main(String[] args) {
        add(4, 3);
        add(4, 2, 1);
        multiply(2, 3);


    }

}
