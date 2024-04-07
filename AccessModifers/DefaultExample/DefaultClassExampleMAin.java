package AccessModifers.DefaultExample;

public class DefaultClassExampleMAin {

    public static void main(String[] args) {
        DefaultClass dc = new DefaultClass();     //Default method accessed within the same package

        System.out.println(dc.defaultMethod());
    }}