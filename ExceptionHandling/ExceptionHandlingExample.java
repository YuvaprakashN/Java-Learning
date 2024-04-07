package ExceptionHandling;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionHandlingExample {

    static List<Integer> userIds= new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7}));
    public static void exception1() {
        throw new RuntimeException("Exception 1 Thrown");
    }

    public static void checkUserIsAvailable(int id) throws UserNotFoundException {
        if(!userIds.contains(id))
          throw new UserNotFoundException("User Id "+id+" not found");
    }

    public static void main(String[] args) {

        System.out.println("Calling Runtime exception");
        try {
            exception1();
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("Calling Custom exception");
        try{
            checkUserIsAvailable(8);
        }
        catch (UserNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
