package Chapter2;

//In Java, labels are used to name a block of code. Typically, labels are used in conjunction with loops and switch statements to control the flow of execution, but they can actually be used with any block of code, including blocks following if-then statements.
//
//        This means that you can apply a label to a block of code that may or may not execute based on an if-then condition. Once labeled, the block of code can be referenced with certain control flow statements like break or continue.
//
//        Syntax for Labels:
//        A label consists of an identifier followed by a colon (:), placed before a block of code or statement.
//
//        Example with if-then and labeled block:
//        You can apply labels to a block of code following an if statement, as shown below:

public class LabelExample {
   public void test(){
       labelName: {
           // Block of code
       }
   }
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Label before a block that follows an if statement
        if (x < y) {
            labeledBlock: {  // This is a labeled block
                System.out.println("x is less than y.");
                if (x == 5) {
                    break labeledBlock;  // Exits the labeled block
                }
                System.out.println("This will not be printed.");
            }
        }

        System.out.println("Outside the labeled block.");
    }
}
//Explanation:
//  Label (labeledBlock): This label is applied to the block that follows the if condition x < y.
//  break labeledBlock;: Inside the labeled block, if x == 5 (which is true here), the break statement causes the execution to exit the labeled block, skipping the remaining statements within that block.
