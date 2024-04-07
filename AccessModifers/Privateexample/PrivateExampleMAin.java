package AccessModifers.Privateexample;

class PrivateClass{
    private String text="Private Variable";
    private String method(){
        System.out.println("Insde private method");
        return text;
    }
}


public class PrivateExampleMAin {
PrivateClass pc=new PrivateClass();

    public static void main(String[] args) {
        // ps.text;  Private variable are not accessible
        // ps.method();  Private maethod are not accessible
    }


}
