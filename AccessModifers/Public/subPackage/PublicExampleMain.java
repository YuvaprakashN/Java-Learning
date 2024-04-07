package AccessModifers.Public.subPackage;

import AccessModifers.Public.PublicExample;

public class PublicExampleMain {

    public static void main(String[] args) {
        PublicExample pc=new PublicExample();
        System.out.println("Calling public variable: "+pc.publicVariable);
        System.out.println("Calling public method: "+pc.publicMethod());
    }
}
