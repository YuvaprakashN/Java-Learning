package AccessModifers.ProtectedExample;

public class ProtectedExampleInsidePacakageMain {
    public static void main(String[] args) {
        ProtectedClassExample pc=new ProtectedClassExample();

        System.out.println("Calling Protected Varable from same package: "+ pc.protectedVariable);
        System.out.println("Calling Protected method from same package: "+ pc.protectedMethod());
    }
}
