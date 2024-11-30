package Chapter2;

public class Label {
    public static void main(String[] args) {

        if (true)myLabel:  {
            System.out.println("Inside labeled block");
            break myLabel; // Exits the labeled block
//            System.out.println("This won't print"); // :9:13 java: unreachable statement
        }
        System.out.println("After labeled block");

        System.out.println();

        outer: {
            System.out.println("Entering outer block");
            inner: {
                System.out.println("Entering inner block");
                if (true) break outer; // Exits the outer block
                System.out.println("This won't print");
            }
            System.out.println("This won't print either");
        }
        System.out.println("After outer block");

    }

//    void someMethod()optionalLabel:{ // c.err
//
//    }
//    Block Statements:
//
//    Control Flow Blocks: This includes blocks defined by control statements such as:
//    if-then statements
//    for, while, and do-while loops
//    switch statements
//
//    Initializer Blocks: These are blocks that initialize class members:
//    Static initializer blocks
//    Instance initializer blocks
//    Method Bodies: While labels cannot be applied to method declarations, any block within a method can be labeled if it contains its own block.
}
