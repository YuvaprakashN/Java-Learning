package AccessModifers.DefaultExample;

public class DefaultClassExampleMAin {

    public static void main(String[] args) {

        //Default method accessed within the same package
        DefaultClass dc = new DefaultClass();

        System.out.println(dc.defaultMethod());
    }}