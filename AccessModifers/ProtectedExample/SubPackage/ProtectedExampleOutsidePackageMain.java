package AccessModifers.ProtectedExample.SubPackage;

import AccessModifers.ProtectedExample.ProtectedClassExample;

public class ProtectedExampleOutsidePackageMain {

    public static void main(String[] args) {
        ProtectedClassExample pc = new ProtectedClassExample();

        //Protected variables/Methods/Constructor cannot call from outside package
        //System.out.println("Calling Protected Varable from outside package: "+ pc.protectedVariable);
        //System.out.println("Calling Protected method from outside package: "+ pc.protectedMethod());

    }
}
