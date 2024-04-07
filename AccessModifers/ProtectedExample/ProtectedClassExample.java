package AccessModifers.ProtectedExample;

public class ProtectedClassExample {

    protected  String protectedVariable="I am Protected Variable";
    protected String protectedMethod(){
        return "From Protected Method";
    }


    //Public Constructor
    public ProtectedClassExample(){}

    //Protected Constructor
    protected ProtectedClassExample(String msg){
        System.out.println("Inside Proteced Contructor");
    }
}
