package Chapter6.Practice;

// Ch8_28
public class Stranger {
    public static String getFullName(String firstName, String lastName) {

//        try {
//            return firstName.toString() + " " + lastName.toString();
//        }finally { // -> the last block of try-catch
//            System.out.println("Finished!");
//        }
//        catch (NullPointerException ex){
//            System.out.println("Problem?"); // NOT COMPILE -> Wrong order
//        }
        try {
            return firstName.toString() + " " + lastName.toString(); // return String value, but not prints yet
        }
        catch (NullPointerException ex){
            System.out.println("Problem?");
        }
        finally { // -> the last block of try-catch
            System.out.println("Finished!");// After try print this
        }

        return null; // If it would not exist -> not compile --> if try block -> would not return String(exception occurs),
        // it forward to catch block then if successful, complete the method but does not return String  --> or return null(String type covariant); in catch block
    }

    public static void main(String[] args) {
        System.out.println(getFullName("Joyce","Hopper"));// read the value which is returned from method and print

        // Expand the operation
        String fullName = getFullName("Joyce", "Hopper");// finally block print works
        System.out.println(fullName); // returned value print
    }

}
