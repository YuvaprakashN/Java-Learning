package AccessModifers.ProtectedExample.SubPackage;

import AccessModifers.ProtectedExample.ProtectedClassExample;

public class ProtectedExampleOutsidePackageIngeritanceMain extends ProtectedClassExample {

    public static void main(String[] args) {
        ProtectedExampleOutsidePackageIngeritanceMain pc=new ProtectedExampleOutsidePackageIngeritanceMain();

        System.out.println("Calling protected variable from outside package through inheritance "+pc.protectedVariable);
        System.out.println("Calling protected method from outside package through inheritance"+pc.protectedMethod());
    }

}
